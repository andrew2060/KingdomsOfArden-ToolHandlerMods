package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;



import java.util.UUID;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModVision extends WeaponMod {

	public ModVision() {
		super(UUID.fromString("c82caeba-a1de-11e3-a5e2-0800200c9a66"),"Vision", 12, true,"Attacks gain 20% Damage at Night");
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		long time = event.getEntity().getWorld().getTime();
		if(time < 12300 || time > 23850) {
			event.setDamage(event.getDamage()*1.2);
		}
	}

}
