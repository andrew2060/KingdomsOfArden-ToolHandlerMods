package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModKeir extends ArmorMod{

    public ModKeir() {
        super(UUID.fromString("c01b5166-b60e-11e3-a5e2-0800200c9a66"), "Keir", 6, true);
        setProtBonus(1.00);
        setKnockbackResist(1.00);
        setMagicResist(5.00);
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
