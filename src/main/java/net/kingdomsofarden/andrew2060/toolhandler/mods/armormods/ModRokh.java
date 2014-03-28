package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModRokh extends ArmorMod {

    public ModRokh() {
        super(UUID.fromString("db304c21-b619-11e3-a5e2-0800200c9a66"), "Rokh", 4, true);
        setMagicResist(5.00);
        setProtBonus(-2.00);
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
