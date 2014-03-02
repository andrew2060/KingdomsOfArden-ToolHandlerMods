package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.LinkedList;
import java.util.List;


import java.util.UUID;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModWithering extends WeaponMod {
	public ModWithering() {
		super(UUID.fromString("c82caebc-a1de-11e3-a5e2-0800200c9a66"),"Withering", 2, true, "Attacks slow target by 40% for 1 second","Attacks slow target attack speed by 20% for 2 seconds");
		List<PotionEffect> effects = new LinkedList<PotionEffect>();
		effects.add(PotionEffectType.SLOW.createEffect(20,2));
		effects.add(PotionEffectType.SLOW_DIGGING.createEffect(40,1));
		this.addPotionEffectsTarget(effects);
		setBonusDamage(4.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
