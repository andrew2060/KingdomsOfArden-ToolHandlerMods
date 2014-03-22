package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;





import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModSprint extends WeaponMod {
	public ModSprint() {
		super(UUID.fromString("c82caeb5-a1de-11e3-a5e2-0800200c9a66"),"Sprint",2,true,
		        ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Self Attack Speed (D: 2s)");
		this.addPotionEffectsSelf(PotionEffectType.FAST_DIGGING.createEffect(40, 1));
		setBonusDamage(5.00);
		setCritChance(5.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
