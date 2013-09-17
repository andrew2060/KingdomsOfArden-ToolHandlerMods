package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModEther extends WeaponMod {

	public ModEther() {
		super("Ether",12,true);
		setBonusDamage(3.00);
		setLifeSteal(1.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
