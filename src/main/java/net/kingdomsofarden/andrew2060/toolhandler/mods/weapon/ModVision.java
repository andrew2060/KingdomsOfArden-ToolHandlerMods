package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModVision extends WeaponMod {

	public ModVision() {
		super("Vision", new String[] {"+10% Critical Strike Chance","Attacks gain 20% Damage at Night"}, 12, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+10, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		long time = event.getEntity().getWorld().getTime();
		if(time < 12300 || time > 23850) {
			event.setDamage(event.getDamage()*1.2);
		}
	}

}
