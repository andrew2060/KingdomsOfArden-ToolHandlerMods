package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModLunar extends WeaponMod {

	public ModLunar() {
		super("Lunar", 12, true, "+2 Bonus Damage");
		setBonusDamage(2.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		long time = event.getEntity().getWorld().getTime();
		if(time < 12300 || time > 23850) {
			event.setDamage(event.getDamage()*1.1);
		}
	}

}
