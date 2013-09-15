package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModSprint extends WeaponMod {
	public ModSprint() {
		super("Sprint",new String[] {"+5 Bonus Damage","+5% Critical Strike Chance","Attacks Increase Attack Speed by 15% for 2 Seconds"},2,true);
		this.addPotionEffectsSelf(PotionEffectType.FAST_DIGGING.createEffect(40, 1));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5, weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+5, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
