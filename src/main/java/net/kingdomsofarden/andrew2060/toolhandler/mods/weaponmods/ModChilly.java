package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModChilly extends WeaponMod {
	public ModChilly() {
		super(UUID.fromString("c82c87a1-a1de-11e3-a5e2-0800200c9a66"),"Chilly", 8, true,"Attacks slow target by 20% for 1 second");
		addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20,1));
		setBonusDamage(3.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
