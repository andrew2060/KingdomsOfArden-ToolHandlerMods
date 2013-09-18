package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModConclave extends ArmorMod {

    public ModConclave() {
        super("Conclave", 16, false);
        setHealingBonus(10.00);
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
