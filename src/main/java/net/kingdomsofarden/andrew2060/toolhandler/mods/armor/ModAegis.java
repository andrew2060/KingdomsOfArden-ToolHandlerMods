package net.kingdomsofarden.andrew2060.toolhandler.mods.armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.party.HeroParty;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.ArmorLoreUtil;

public class ModAegis extends ArmorMod {
    Heroes heroesPlugin;
    public ModAegis() {
        super("Aegis", new String[] {"+5% Magic Resistance","+5% Health Regeneration", ChatColor.AQUA + "Unique Aura:" + ChatColor.GRAY + " 20% Damage Reduction to Nearby Party Members"}, 1, true);
        this.heroesPlugin = (Heroes) Bukkit.getPluginManager().getPlugin("Heroes");
    }

    @Override
    public void applyToArmor(ItemStack armor) {
        ArmorLoreUtil.addMagicResistRating(5,armor);
        ArmorLoreUtil.addHealingBonus(5,armor);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        return;
    }

    @Override
    public void executeOnTick(Player p) {
        Hero h = heroesPlugin.getCharacterManager().getHero(p);
        HeroParty hP = h.getParty();
        if(hP == null) {
            pEMan.addPotionEffectStacking(PotionEffectType.DAMAGE_RESISTANCE.createEffect(20, 1),p,false);
            return;
        } else {
            p.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(20, 1));
            for(Hero member : hP.getMembers()) {
                for(PotionEffect pE : member.getEntity().getActivePotionEffects()) {
                    if(pE.getType().equals(PotionEffectType.DAMAGE_RESISTANCE)) {
                        if(pE.getAmplifier() > 1) {
                            return;
                        }
                        if(pE.getDuration() > 20) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                pEMan.addPotionEffectStacking(PotionEffectType.DAMAGE_RESISTANCE.createEffect(20, 1),member.getEntity(),false);
            }
        }
    }

}
