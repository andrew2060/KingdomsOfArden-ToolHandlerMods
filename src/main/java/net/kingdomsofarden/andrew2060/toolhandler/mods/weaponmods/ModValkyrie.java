package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;





import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModValkyrie extends WeaponMod {
	public ModValkyrie() {
		super(UUID.fromString("c82caeb9-a1de-11e3-a5e2-0800200c9a66"),"Valkyrie",2,true,
		        ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Self Jump Height (D: 2s)");
		this.addPotionEffectsSelf(PotionEffectType.JUMP.createEffect(40, 2));
		setBonusDamage(5.00);
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {		
	    return;
	}
}
