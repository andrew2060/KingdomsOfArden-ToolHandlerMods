package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModCelest extends WeaponMod {
	public ModCelest() {
		super(UUID.fromString("5eff2d04-a1de-11e3-a5e2-0800200c9a66"),"Celest", 12, true);
		setLifeSteal(2.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
