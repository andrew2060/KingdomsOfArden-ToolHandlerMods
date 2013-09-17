package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;


import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModRunic extends WeaponMod {

	public ModRunic() {
		super("Runic", 8 , true, "Attacks Increase Movement Speed by 15% for 2 Seconds");
		this.addPotionEffectsSelf(PotionEffectType.SPEED.createEffect(40, 1));
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;		
	}

}
