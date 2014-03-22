package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModGenius extends WeaponMod {
	public ModGenius() {
		super(UUID.fromString("c82c87a8-a1de-11e3-a5e2-0800200c9a66"),"Genius",12,true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Self Movement Speed (D: 2s)");
		addPotionEffectsSelf(PotionEffectType.SPEED.createEffect(40, 1));
		setBonusDamage(3.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
