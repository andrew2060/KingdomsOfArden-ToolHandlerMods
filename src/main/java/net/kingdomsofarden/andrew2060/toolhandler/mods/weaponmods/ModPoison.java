package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;





import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModPoison extends WeaponMod {
	public ModPoison() {
		super(UUID.fromString("c82c87b4-a1de-11e3-a5e2-0800200c9a66"),"Poison",11,true,ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GRAY + "Poisons Target (D: 3s)");
	    this.addPotionEffectsTarget(PotionEffectType.POISON.createEffect(60, 1));
	    setBonusDamage(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		return;
	}
}
