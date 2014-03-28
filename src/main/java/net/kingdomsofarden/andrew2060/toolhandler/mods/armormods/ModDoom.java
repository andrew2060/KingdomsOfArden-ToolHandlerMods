package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModDoom extends ArmorMod {

    public ModDoom() {
        super(UUID.fromString("e2ae0ccc-b604-11e3-9f3b-425861b86ab6"), "Doom", 2, true);
        this.setKnockbackResist(5.00);
        this.setMagicResist(-50.00);
        this.setProtBonus(20.00);
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
