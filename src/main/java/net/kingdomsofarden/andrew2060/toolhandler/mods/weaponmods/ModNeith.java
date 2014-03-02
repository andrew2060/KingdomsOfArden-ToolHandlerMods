package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




public class ModNeith extends WeaponMod {

	public ModNeith() {
		super(UUID.fromString("c82c87b2-a1de-11e3-a5e2-0800200c9a66"),"Neith",16,true);
		setBonusDamage(3.00);
		setCritChance(5.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
