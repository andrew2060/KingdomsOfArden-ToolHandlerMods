package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModAorme extends ArmorMod {

    public ModAorme() {
        super(UUID.fromString("c01b5161-b60e-11e3-a5e2-0800200c9a66"), "Aorme", 5, true);
        setProtBonus(5.00);
        setMagicResist(-2.50);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
    }

    @Override
    public void executeOnTick(Player p) {
        
    }

}
