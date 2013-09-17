package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModDraining extends WeaponMod {

	public ModDraining() {
		super("Draining", 8, true, "Attacks Slow Target by 20% for One Second");
		addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20, 1));
		setLifeSteal(2.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}
}
