package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModUniversal extends WeaponMod {

	public ModUniversal() {
		super(UUID.fromString("c82caeb8-a1de-11e3-a5e2-0800200c9a66"),"Universal", 20, true);
		setBonusDamage(1.00);
		setCritChance(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
