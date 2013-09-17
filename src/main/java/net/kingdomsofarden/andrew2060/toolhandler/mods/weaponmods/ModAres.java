package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModAres extends WeaponMod {

	public ModAres() {
		super("Ares", 20, true);
		setBonusDamage(2.00);
		setCritChance(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
