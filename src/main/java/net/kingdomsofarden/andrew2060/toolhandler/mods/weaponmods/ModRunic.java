package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;


import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModRunic extends WeaponMod {

	public ModRunic() {
		super(UUID.fromString("c82caeb1-a1de-11e3-a5e2-0800200c9a66"),"Runic", 8 , true, 
		        ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " 
		                + ChatColor.GRAY + "Self Movement Speed (D: 2s)");
		this.addPotionEffectsSelf(PotionEffectType.SPEED.createEffect(40, 1));
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;		
	}

}
