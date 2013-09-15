package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;



public class ModOmega extends WeaponMod {

	public ModOmega() {
		super("Omega",new String[] {"+3 Bonus Damage","+1% Life Steal","+15% Critical Strike Chance"},1,true);
	}
	
	@Override
	public void applyToWeapon(ItemStack weapon){
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+3,weapon);
		WeaponLoreUtil.setLifeSteal(WeaponLoreUtil.getLifeSteal(weapon)+1,weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+15, weapon);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
