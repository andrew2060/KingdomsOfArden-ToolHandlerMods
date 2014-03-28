package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModWarlock extends ArmorMod {

    public ModWarlock() {
        super(UUID.fromString("cf548098-b609-11e3-9f3b-425861b86ab6"), "Warlock", 5, true);
        setProtBonus(2.50);
        setKnockbackResist(1.00);
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
