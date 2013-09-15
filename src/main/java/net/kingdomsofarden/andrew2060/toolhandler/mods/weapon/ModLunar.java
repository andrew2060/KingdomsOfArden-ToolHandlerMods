package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModLunar extends WeaponMod {

	public ModLunar() {
		super("Lunar", new String[] {"+2 Bonus Damage","Attacks gain 10% Damage at Night"}, 12, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+2, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		long time = event.getEntity().getWorld().getTime();
		if(time < 12300 || time > 23850) {
			event.setDamage(event.getDamage()*1.1);
		}
	}

}
