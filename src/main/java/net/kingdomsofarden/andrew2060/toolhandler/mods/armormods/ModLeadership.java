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

public class ModLeadership extends ArmorMod {
    Heroes heroesPlugin;
    public ModLeadership() {
        super(UUID.fromString("1411444c-a4d9-11e3-be40-425861b86ab6"),"Leadership", 1, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.DARK_GREEN + "Aura:" + ChatColor.GRAY + " 20% Damage to Nearby Party Members");
        this.heroesPlugin = ToolHandlerPlugin.instance.heroesPlugin;
        setProtBonus(2.50);
        setKnockbackResist(5.00);
        setMagicResist(-5.00);
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
            pEMan.addPotionEffectStacking(PotionEffectType.INCREASE_DAMAGE.createEffect(20, 1),p,false);
            return;
        } else {
            p.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(20, 1));
            for(Hero member : hP.getMembers()) {
                if(member.getPlayer().getLocation().distanceSquared(p.getLocation()) < 169) {
                    pEMan.addPotionEffectStacking(PotionEffectType.INCREASE_DAMAGE.createEffect(20, 1),member.getEntity(),false);
                }
            }
        }
    }

}
