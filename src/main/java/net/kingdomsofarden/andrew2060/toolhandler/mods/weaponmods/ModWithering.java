package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.LinkedList;
import java.util.List;


import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModWithering extends WeaponMod {
	public ModWithering() {
		super(UUID.fromString("c82caebc-a1de-11e3-a5e2-0800200c9a66"),"Withering", 2, true, 
		        ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-40%" + ChatColor.GRAY + " Target Speed (D: 1s)",
		        ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-20%" + ChatColor.GRAY + " Target Attack Speed (D: 2s)");
		List<PotionEffect> effects = new LinkedList<PotionEffect>();
		effects.add(PotionEffectType.SLOW.createEffect(20,2));
		effects.add(PotionEffectType.SLOW_DIGGING.createEffect(40,1));
		this.addPotionEffectsTarget(effects);
		setBonusDamage(4.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
