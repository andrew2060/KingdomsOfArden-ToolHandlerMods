package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModAce extends WeaponMod {

	public ModAce() {
		super(UUID.fromString("f978ba51-a1dd-11e3-a5e2-0800200c9a66"),"Ace",4,true);
		setBonusDamage(5.00);
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
