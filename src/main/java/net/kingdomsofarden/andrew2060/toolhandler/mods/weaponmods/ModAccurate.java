package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModAccurate extends WeaponMod {

	public ModAccurate() {
		super(UUID.fromString("f978ba50-a1dd-11e3-a5e2-0800200c9a66"),"Accurate",12,true);
		setBonusDamage(3.00);
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}