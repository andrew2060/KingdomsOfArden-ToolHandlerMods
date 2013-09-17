package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBulwark extends ArmorMod {

    public ModBulwark() {
        super("Bulwark", 1, true, "Reduces all projectile damage by 30%");
        setMagicResist(10.00);
        setProtBonus(3.00);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        if(event.getAttackerEntity() instanceof Projectile) {
            event.setDamage(event.getDamage() * 0.7);
            return;
        }
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
