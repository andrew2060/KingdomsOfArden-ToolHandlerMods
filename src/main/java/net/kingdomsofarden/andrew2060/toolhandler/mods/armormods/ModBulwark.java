package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBulwark extends ArmorMod {

    public ModBulwark() {
        super(UUID.fromString("14113858-a4d9-11e3-be40-425861b86ab6"),"Bulwark", 1, true, ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+10% " + ChatColor.GRAY + "Projectile Resistance");
        setMagicResist(10.00);
        setProtBonus(3.00);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        if(event.getAttackerEntity() instanceof Projectile) {
            event.setDamage(event.getDamage() * 0.9);
            return;
        }
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
