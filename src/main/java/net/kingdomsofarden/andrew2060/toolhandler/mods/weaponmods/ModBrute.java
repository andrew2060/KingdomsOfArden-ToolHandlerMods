package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModBrute extends WeaponMod {
	public ModBrute() {
		super("Brute", 16, true);
		setBonusDamage(4.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
