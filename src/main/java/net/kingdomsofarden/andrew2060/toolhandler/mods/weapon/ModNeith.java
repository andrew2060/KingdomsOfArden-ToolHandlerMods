package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;



public class ModNeith extends WeaponMod {

	public ModNeith() {
		super("Neith",new String[] {"+3 Bonus Damage","+5% Critical Strike Chance"},16,true);
	}
	
	@Override
	public void applyToWeapon(ItemStack weapon){
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+3,weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+5, weapon);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
