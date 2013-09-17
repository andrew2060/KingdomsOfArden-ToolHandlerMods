package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




public class ModLegend extends WeaponMod {

	public ModLegend() {
		super("Legend",1,true);
		setBonusDamage(5.00);
		setLifeSteal(2.00);
		setCritChance(5.00);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
