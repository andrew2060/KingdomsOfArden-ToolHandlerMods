package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;



public class ModMono extends WeaponMod {

	public ModMono() {
		super("Mono",new String[] {"+1 Bonus Damage","+1% Life Steal","+1% Critical Strike Chance"},24,true);
	}
	
	@Override
	public void applyToWeapon(ItemStack weapon){
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+1,weapon);
		WeaponLoreUtil.setLifeSteal(WeaponLoreUtil.getLifeSteal(weapon)+1,weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+1, weapon);
	}
	
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event){
		return;
	}

}
