package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




public class ModOmega extends WeaponMod {

	public ModOmega() {
		super(UUID.fromString("c82c87b3-a1de-11e3-a5e2-0800200c9a66"),"Omega",1,true);
		setBonusDamage(3.00);
		setLifeSteal(1.00);
		setCritChance(15.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
