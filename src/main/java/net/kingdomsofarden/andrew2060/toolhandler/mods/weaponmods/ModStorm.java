package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModStorm extends WeaponMod {

	public ModStorm() {
		super("Storm", 1, true, "Attacks gain 20% Damage When Storming");
		setBonusDamage(5.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.getEntity().getWorld().hasStorm()) {
			event.setDamage(event.getDamage()*1.2);
		}
	}

}
