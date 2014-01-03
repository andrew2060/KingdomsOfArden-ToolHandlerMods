package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModBaron extends ArmorMod {

    public ModBaron() {
        super("Baron", 1, true);
        setMagicResist(-5.00);
        setHealingBonus(-5.00);
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
