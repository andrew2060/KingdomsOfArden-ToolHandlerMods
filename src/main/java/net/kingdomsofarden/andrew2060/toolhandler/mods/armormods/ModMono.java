package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModMono extends ArmorMod {

    public ModMono() {
        super(UUID.fromString("c01b5164-b60e-11e3-a5e2-0800200c9a66"), "Mono", 4, true);
        setKnockbackResist(1.00);
        setProtBonus(1.00);
        setMagicResist(1.00);
        
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
