package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModLunatic extends WeaponMod {

	public ModLunatic() {
		super(UUID.fromString("c82c87b0-a1de-11e3-a5e2-0800200c9a66"),"Lunatic",24,true);
		setBonusDamage(3.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
