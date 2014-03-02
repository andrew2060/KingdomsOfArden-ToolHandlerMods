package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




public class ModSavage extends WeaponMod {

	public ModSavage() {
		super(UUID.fromString("c82caeb3-a1de-11e3-a5e2-0800200c9a66"),"Savage",20,true);
		setBonusDamage(4.00);
	}	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
