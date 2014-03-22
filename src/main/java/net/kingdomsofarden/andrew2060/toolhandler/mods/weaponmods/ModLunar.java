package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.ChatColor;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModLunar extends WeaponMod {

	public ModLunar() {
		super(UUID.fromString("c82c87af-a1de-11e3-a5e2-0800200c9a66"),"Lunar", 12, true, ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+10% " + ChatColor.GRAY + "Physical Damage at Night");
		setBonusDamage(2.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		long time = event.getEntity().getWorld().getTime();
		if(time < 12300 || time > 23850) {
			event.setDamage(event.getDamage()*1.1);
		}
	}

}
