package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




public class ModWarrior extends WeaponMod {

	public ModWarrior() {
		super("Warrior",4,true);
		setBonusDamage(7.00);
		setLifeSteal(1.00);
	}	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
