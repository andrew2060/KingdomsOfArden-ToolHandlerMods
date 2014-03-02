package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




public class ModMono extends WeaponMod {

	public ModMono() {
		super(UUID.fromString("c82c87b1-a1de-11e3-a5e2-0800200c9a66"),"Mono",24,true);
		setBonusDamage(1.00);
		setLifeSteal(1.00);
		setCritChance(1.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
