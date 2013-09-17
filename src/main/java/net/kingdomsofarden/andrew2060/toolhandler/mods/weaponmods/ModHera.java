package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModHera extends WeaponMod {

	public ModHera() {
		super("Hera",12,true);
		setBonusDamage(3.00);
		setLifeSteal(1.00);
		setCritChance(3.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
