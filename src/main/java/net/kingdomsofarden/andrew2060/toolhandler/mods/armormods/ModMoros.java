package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModMoros extends ArmorMod {

    public ModMoros() {
        super(UUID.fromString("74bc1e10-b619-11e3-a5e2-0800200c9a66"), "Moros", 4, true);
        setMagicResist(1.00);
        setProtBonus(2.00);
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
