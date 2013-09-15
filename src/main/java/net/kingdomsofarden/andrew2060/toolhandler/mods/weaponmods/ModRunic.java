package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModRunic extends WeaponMod {

	public ModRunic() {
		super("Runic", new String[] {"+10% Critical Strike Chance","Attacks Increase Movement Speed by 15% for 2 Seconds"}, 8 , true);
		this.addPotionEffectsSelf(PotionEffectType.SPEED.createEffect(40, 1));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+10, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;		
	}

}
