package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModFrozen extends ArmorMod {

    public ModFrozen() {
        super(UUID.fromString("5d735342-b61e-11e3-a5e2-0800200c9a66"), "Frozen", 2, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-20%" + ChatColor.GRAY + " attacker movement speed (D: 1s)");
        setMagicResist(-0.50);
        setProtBonus(+1.0);
        this.applyAttackerOnDamage.add(PotionEffectType.SLOW.createEffect(20,1));
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
