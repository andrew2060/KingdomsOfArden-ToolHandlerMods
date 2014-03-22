package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModChasm extends WeaponMod {
	public ModChasm() {
		super(UUID.fromString("c82c87a0-a1de-11e3-a5e2-0800200c9a66"),"Chasm", 24, true, ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+2" + ChatColor.GRAY + " Magic Damage");
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		Skill.damageEntity((LivingEntity) event.getEntity(), event.getDamager().getEntity(), 2.0, DamageCause.MAGIC);
	}

}
