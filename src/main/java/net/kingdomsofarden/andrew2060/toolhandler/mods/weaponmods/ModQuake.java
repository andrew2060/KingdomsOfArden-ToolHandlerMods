package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModQuake extends WeaponMod {

	public ModQuake() {
		super("Quake", new String[] {"+5 Bonus Damage","Attacks below y=50 gain 10% damage"}, 2, true );
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5,weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(!event.isCancelled()) {
			if(event.getDamager().getEntity().getLocation().getY() < 50) {
				event.setDamage(event.getDamage()*1.1);
			}
		}
	}

}
