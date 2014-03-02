package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModIcy extends WeaponMod {

	public ModIcy() {
		super(UUID.fromString("c82c87ac-a1de-11e3-a5e2-0800200c9a66"),"Icy",2, true, "Attacks slow target by 40% for 1 second");
		this.addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20, 2));
		setBonusDamage(4.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
