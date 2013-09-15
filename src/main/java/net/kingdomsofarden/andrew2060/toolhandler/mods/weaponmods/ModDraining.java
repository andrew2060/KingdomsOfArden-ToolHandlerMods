package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModDraining extends WeaponMod {

	public ModDraining() {
		super("Draining", new String[] {"+2% Life Steal","Attacks Slow Target by 20% for One Second"}, 8, true);
		this.addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20, 1));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setLifeSteal(WeaponLoreUtil.getLifeSteal(weapon)+2,weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}
}
