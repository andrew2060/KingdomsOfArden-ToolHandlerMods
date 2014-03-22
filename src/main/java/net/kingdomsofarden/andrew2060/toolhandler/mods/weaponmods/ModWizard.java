package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;




import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModWizard extends WeaponMod {
	public ModWizard() {
		super(UUID.fromString("c82caebd-a1de-11e3-a5e2-0800200c9a66"),"Wizard", 4, true, ChatColor.AQUA + "Bonus: " + ChatColor.GRAY + "Attacks deal 90% Physical Damage", ChatColor.AQUA + "Bonus: " + ChatColor.GRAY + "Attacks deal 10% Magic Damage");
		setBonusDamage(5.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		double dmg = event.getDamage();
		event.setDamage(dmg*0.9);
		Skill.damageEntity((LivingEntity) event.getEntity(), event.getDamager().getEntity(), dmg*0.1 , DamageCause.MAGIC);
	}

}
