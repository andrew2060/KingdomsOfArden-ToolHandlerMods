package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModPoison extends WeaponMod {
	public ModPoison() {
		super("Poison",new String[] {"+5 Bonus Damage","Attacks apply 3 seconds of poison"},11,true);
	    this.addPotionEffectsTarget(PotionEffectType.POISON.createEffect(60, 1));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
