package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModLunatic extends WeaponMod {

	public ModLunatic() {
		super("Lunatic",24,true);
		setBonusDamage(3.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
