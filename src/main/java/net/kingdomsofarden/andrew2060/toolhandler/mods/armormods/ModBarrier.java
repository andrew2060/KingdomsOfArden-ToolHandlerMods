package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBarrier extends ArmorMod {

    public ModBarrier() {
        super(UUID.fromString("14113c7c-a4d9-11e3-be40-425861b86ab6"),"Barrier", 12, true);
        setMagicResist(2.5);
        setProtBonus(1.00);
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
