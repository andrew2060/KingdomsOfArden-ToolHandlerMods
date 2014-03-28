package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModFeathery extends ArmorMod{

    public ModFeathery() {
        super(UUID.fromString("cf5485f2-b609-11e3-9f3b-425861b86ab6"), "Feathery", 6, true);
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
