package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModValkyrie extends WeaponMod {
	public ModValkyrie() {
		super("Valkyrie",new String[] {"+5 Bonus Damage","+10% Critical Strike Chance","Attacks Increase Jump Height for 2 Seconds"},2,true);
		this.addPotionEffectsSelf(PotionEffectType.JUMP.createEffect(40, 2));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5, weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+10, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {		
	    return;
	}
}
