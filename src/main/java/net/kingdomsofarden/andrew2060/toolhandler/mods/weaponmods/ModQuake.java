package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModQuake extends WeaponMod {

	public ModQuake() {
		super("Quake", 2, true,"Attacks below y=50 gain 10% damage" );
		setBonusDamage(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(!event.isCancelled()) {
			if(event.getDamager().getEntity().getLocation().getY() < 50) {
				event.setDamage(event.getDamage()*1.1);
			}
		}
	}

}
