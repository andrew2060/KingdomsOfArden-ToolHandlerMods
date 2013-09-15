package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModGenius extends WeaponMod {
	public ModGenius() {
		super("Genius",new String[] {"+3 Bonus Damage","Attacks Increase Movement Speed by 15% for 2 Seconds"},12,true);
		this.addPotionEffectsSelf(PotionEffectType.SPEED.createEffect(40, 1));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+3, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
