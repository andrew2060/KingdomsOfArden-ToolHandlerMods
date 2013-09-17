package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModChilly extends WeaponMod {
	public ModChilly() {
		super("Chilly", 8, true,"Attacks slow target by 20% for 1 second");
		addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20,1));
		setBonusDamage(3.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
