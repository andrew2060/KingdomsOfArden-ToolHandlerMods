package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModAce extends WeaponMod {

	public ModAce() {
		super("Ace",4,true);
		setBonusDamage(5.00);
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
