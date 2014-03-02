package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModDraining extends WeaponMod {

	public ModDraining() {
		super(UUID.fromString("c82c87a5-a1de-11e3-a5e2-0800200c9a66"),"Draining", 8, true, "Attacks Slow Target by 20% for One Second");
		addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20, 1));
		setLifeSteal(2.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}
}
