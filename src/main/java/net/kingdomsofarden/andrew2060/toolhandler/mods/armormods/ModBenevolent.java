package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBenevolent extends ArmorMod {

    public ModBenevolent() {
        super(UUID.fromString("14113a7e-a4d9-11e3-be40-425861b86ab6"),"Benevolent", 8, true);
        setMagicResist(2.5);
        setHealingBonus(12.00);
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
