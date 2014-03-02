package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModPrecise extends WeaponMod {

	public ModPrecise() {
		super(UUID.fromString("c82c87b5-a1de-11e3-a5e2-0800200c9a66"),"Precise", 2, true);
		setBonusDamage(5.00);
		setCritChance(15.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}

}
