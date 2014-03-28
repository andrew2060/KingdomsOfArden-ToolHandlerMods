package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModDaedric extends ArmorMod {

    public ModDaedric() {
        super(UUID.fromString("e2ae09d4-b604-11e3-9f3b-425861b86ab6"), "Daedric", 1, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-20% " + ChatColor.GRAY + "Attacker Damage (D: 1s)", ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "+20% " + ChatColor.GRAY + "Self Damage (D: 1s)");
        this.applyAttackerOnDamage.add(PotionEffectType.WEAKNESS.createEffect(20, 1));
        this.applySelfOnDamage.add(PotionEffectType.INCREASE_DAMAGE.createEffect(20, 1));
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        return;
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
