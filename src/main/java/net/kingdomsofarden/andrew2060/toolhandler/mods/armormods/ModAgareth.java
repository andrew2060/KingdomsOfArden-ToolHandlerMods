package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModAgareth extends ArmorMod {

    public ModAgareth() {
        super(UUID.fromString("14114262-a4d9-11e3-be40-425861b86ab6"),"Agareth", 12, true);
        setMagicResist(2.5);
        setKnockbackResist(-1.00);
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
