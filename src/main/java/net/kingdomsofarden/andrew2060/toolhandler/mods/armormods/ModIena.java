package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModIena extends ArmorMod {

    public ModIena() {
        super(UUID.fromString("c01b5162-b60e-11e3-a5e2-0800200c9a66"), "Ienda", 5, true);
        setProtBonus(-2.50);
        setMagicResist(5.00);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void executeOnTick(Player p) {
        // TODO Auto-generated method stub

    }

}
