package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModEvil extends WeaponMod {

	public ModEvil() {
		super("Evil",4,true);
		setBonusDamage(3.00);
		setLifeSteal(1.00);
		setCritChance(10.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
