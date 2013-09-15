package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModHell extends WeaponMod {

	public ModHell() {
		super("Hell", new String[] {"+5 Bonus Damage","Attacks gain 50% Damage in the Nether"}, 20, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.getEntity().getLocation().getWorld().getName().toLowerCase().contains("nether")) {
			event.setDamage(event.getDamage()*1.5);
		}
	}

}
