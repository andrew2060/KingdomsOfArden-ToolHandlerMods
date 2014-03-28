package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModDeuce extends ArmorMod {

    public ModDeuce() {
        super(UUID.fromString("b3fd0420-b602-11e3-a5e2-0800200c9a66"), "Deuce", 8, true);
        this.setKnockbackResist(2.00);
        this.setProtBonus(2.00);
        this.setMagicResist(2.00);
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
