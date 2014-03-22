package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.World.Environment;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModHell extends WeaponMod {

	public ModHell() {
		super(UUID.fromString("c82c87aa-a1de-11e3-a5e2-0800200c9a66"),"Hell", 20, true, ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+50% " + ChatColor.GRAY + "Damage in the Nether");
		setBonusDamage(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.getEntity().getLocation().getWorld().getEnvironment() == Environment.NETHER) {
			event.setDamage(event.getDamage()*1.5);
		}
	}

}
