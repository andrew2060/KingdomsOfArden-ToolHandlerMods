package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.party.HeroParty;

import net.kingdomsofarden.andrew2060.toolhandler.ToolHandlerPlugin;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModAegis extends ArmorMod {
    Heroes heroesPlugin;
    public ModAegis() {
        super(UUID.fromString("776fdc50-b62d-11e3-a5e2-0800200c9a66"),"Aegis", 1, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.DARK_GREEN + "Aura:" + ChatColor.GRAY + " 20% Damage Reduction to Nearby Party Members");
        this.heroesPlugin = ToolHandlerPlugin.instance.heroesPlugin;
        setMagicResist(2.50);
        setKnockbackResist(5.00);
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
                if(member.getPlayer().getLocation().distanceSquared(p.getLocation()) < 169) {
                    pEMan.addPotionEffectStacking(PotionEffectType.DAMAGE_RESISTANCE.createEffect(20, 1),member.getEntity(),false);
                }
            }
        }
    }

}
