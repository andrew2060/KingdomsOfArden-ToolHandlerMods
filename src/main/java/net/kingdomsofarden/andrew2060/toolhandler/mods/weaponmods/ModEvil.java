package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModEvil extends WeaponMod {

	public ModEvil() {
		super(UUID.fromString("c82c87a7-a1de-11e3-a5e2-0800200c9a66"),"Evil",4,true);
		setBonusDamage(3.00);
		setLifeSteal(1.00);
		setCritChance(10.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
