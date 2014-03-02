package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;



import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModGenius extends WeaponMod {
	public ModGenius() {
		super(UUID.fromString("c82c87a8-a1de-11e3-a5e2-0800200c9a66"),"Genius",12,true,"Attacks Increase Movement Speed by 15% for 2 Seconds");
		addPotionEffectsSelf(PotionEffectType.SPEED.createEffect(40, 1));
		setBonusDamage(3.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
