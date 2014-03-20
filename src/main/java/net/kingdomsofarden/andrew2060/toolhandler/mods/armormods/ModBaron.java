package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBaron extends ArmorMod {

    public ModBaron() {
        super(UUID.fromString("14113e7a-a4d9-11e3-be40-425861b86ab6"),"Baron", 1, true);
        setMagicResist(-5.00);
        setKnockbackResist(-5.00);
        setProtBonus(7.00);
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
