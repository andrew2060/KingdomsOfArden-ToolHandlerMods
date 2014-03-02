package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModCatalyst extends WeaponMod {
	public ModCatalyst() {
		super(UUID.fromString("5eff2d03-a1de-11e3-a5e2-0800200c9a66"),"Catalyst", 12, true);
		setBonusDamage(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
