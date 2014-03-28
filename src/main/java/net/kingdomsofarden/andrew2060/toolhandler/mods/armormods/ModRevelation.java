package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModRevelation extends ArmorMod {

    public ModRevelation() {
        super(UUID.fromString("7f2efbb0-b619-11e3-a5e2-0800200c9a66"), "Revelation", 2, true);
        setMagicResist(3.00);
        setKnockbackResist(1.00);
        setProtBonus(3.00);
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
