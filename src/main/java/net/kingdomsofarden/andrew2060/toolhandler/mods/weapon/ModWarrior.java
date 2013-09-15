package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;



public class ModWarrior extends WeaponMod {

	public ModWarrior() {
		super("Warrior",new String[] {"+7 Bonus Damage","+1% Life Steal"},4,true);
	}
	
	@Override
	public void applyToWeapon(ItemStack weapon){
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+7,weapon);
		WeaponLoreUtil.setLifeSteal(WeaponLoreUtil.getLifeSteal(weapon)+1,weapon);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
