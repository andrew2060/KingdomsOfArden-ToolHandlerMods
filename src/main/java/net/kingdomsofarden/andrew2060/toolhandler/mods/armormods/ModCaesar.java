package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModCaesar extends ArmorMod {

    public ModCaesar() {
        super(UUID.fromString("14113556-a4d9-11e3-be40-425861b86ab6"),"Caesar", 1, false);
        setMagicResist(5.00);
        setKnockbackResist(15.00);
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
