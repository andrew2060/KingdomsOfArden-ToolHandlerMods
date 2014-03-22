package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModChilly extends WeaponMod {
	public ModChilly() {
		super(UUID.fromString("c82c87a1-a1de-11e3-a5e2-0800200c9a66"),"Chilly", 8, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-20%" + ChatColor.GRAY + " Target Speed (D: 1s)");
		addPotionEffectsTarget(PotionEffectType.SLOW.createEffect(20,1));
		setBonusDamage(3.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}

}
