package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModIcy extends WeaponMod {

	public ModIcy() {
		super("Icy", new String[] {"+4 Bonus Damage","Attacks slow target by 40% for 1 second."}, 2, true);
		this.addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20, 2));
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
