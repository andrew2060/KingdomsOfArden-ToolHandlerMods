package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModPrecise extends WeaponMod {

	public ModPrecise() {
		super("Precise", new String[] {"+5 Bonus Damage","+15% Critical Strike Chance"}, 2, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5,weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+15, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}

}
