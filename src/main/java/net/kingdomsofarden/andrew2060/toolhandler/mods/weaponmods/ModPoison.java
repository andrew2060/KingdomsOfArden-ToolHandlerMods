package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;



import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModPoison extends WeaponMod {
	public ModPoison() {
		super("Poison",11,true,"Attacks apply 3 seconds of poison");
	    this.addPotionEffectsTarget(PotionEffectType.POISON.createEffect(60, 1));
	    setBonusDamage(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
