package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModBandit extends WeaponMod {
	public ModBandit() {
		super(UUID.fromString("f978e160-a1dd-11e3-a5e2-0800200c9a66"),"Bandit", 20, true);
		setLifeSteal(1.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
