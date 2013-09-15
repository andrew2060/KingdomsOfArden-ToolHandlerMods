package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModWithering extends WeaponMod {
	public ModWithering() {
		super("Withering", new String[] {"Attacks slow target by 40% for 1 second","Attacks slow target attack speed by 20% for 2 seconds"}, 2, true);
		List<PotionEffect> effects = new LinkedList<PotionEffect>();
		effects.add(PotionEffectType.SLOW.createEffect(20,2));
		effects.add(PotionEffectType.SLOW_DIGGING.createEffect(40,1));
		this.addPotionEffectsTarget(effects);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+4, weapon);
		return;
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
