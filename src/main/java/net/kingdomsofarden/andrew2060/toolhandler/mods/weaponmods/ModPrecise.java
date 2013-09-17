package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModPrecise extends WeaponMod {

	public ModPrecise() {
		super("Precise", 2, true);
		setBonusDamage(5.00);
		setCritChance(15.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}

}
