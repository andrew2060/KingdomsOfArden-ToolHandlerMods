package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;



import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModSprint extends WeaponMod {
	public ModSprint() {
		super("Sprint",2,true,"Attacks Increase Attack Speed by 15% for 2 Seconds");
		this.addPotionEffectsSelf(PotionEffectType.FAST_DIGGING.createEffect(40, 1));
		setBonusDamage(5.00);
		setCritChance(5.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
