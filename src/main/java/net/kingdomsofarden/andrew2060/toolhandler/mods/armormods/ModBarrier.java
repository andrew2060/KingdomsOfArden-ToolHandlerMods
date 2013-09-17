package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBarrier extends ArmorMod {

    public ModBarrier() {
        super("Barrier", 12, true);
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
