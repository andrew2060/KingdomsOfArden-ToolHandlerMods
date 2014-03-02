package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModAres extends WeaponMod {

	public ModAres() {
		super(UUID.fromString("f978ba52-a1dd-11e3-a5e2-0800200c9a66"),"Ares", 20, true);
		setBonusDamage(2.00);
		setCritChance(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
