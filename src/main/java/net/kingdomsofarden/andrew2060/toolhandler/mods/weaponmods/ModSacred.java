package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;




import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModSacred extends WeaponMod {
	public ModSacred() {
		super(UUID.fromString("c82caeb2-a1de-11e3-a5e2-0800200c9a66"),"Sacred", 24, true,
		        ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+2 " + ChatColor.GRAY  + "Magic Damage",
		        "When Target has a Higher Percent Health");
		setBonusDamage(4.00);
		setLifeSteal(1.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		LivingEntity lE = (LivingEntity) event.getEntity();
		LivingEntity aE = event.getDamager().getEntity();
		if((lE.getHealth()/lE.getMaxHealth()) > (aE.getHealth()/aE.getMaxHealth())) {
			Skill.damageEntity(lE, event.getDamager().getEntity(), 2.0, DamageCause.MAGIC);
		}
	}

}
