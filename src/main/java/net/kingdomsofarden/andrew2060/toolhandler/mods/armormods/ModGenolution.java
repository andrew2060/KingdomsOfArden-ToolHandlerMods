package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModGenolution extends ArmorMod {

    public ModGenolution() {
        super(UUID.fromString("a7d0c9d0-b61a-11e3-a5e2-0800200c9a66"),"Genolution", 3, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Damage Boost (D: 1s)");
        this.applySelfOnDamage.add(PotionEffectType.INCREASE_DAMAGE.createEffect(20, 1));
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
