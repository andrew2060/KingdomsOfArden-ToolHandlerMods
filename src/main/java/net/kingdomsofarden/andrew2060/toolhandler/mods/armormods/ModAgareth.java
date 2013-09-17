package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModAgareth extends ArmorMod {

    public ModAgareth() {
        super("Agareth", 12, true);
        setMagicResist(2.5);
        setHealingBonus(-1.00);
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
