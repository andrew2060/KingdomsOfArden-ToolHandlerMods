package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModEther extends WeaponMod {

	public ModEther() {
		super(UUID.fromString("c82c87a6-a1de-11e3-a5e2-0800200c9a66"),"Ether",12,true);
		setBonusDamage(3.00);
		setLifeSteal(1.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
