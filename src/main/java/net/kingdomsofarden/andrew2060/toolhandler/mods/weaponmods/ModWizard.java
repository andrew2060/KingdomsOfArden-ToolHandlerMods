package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;


import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModWizard extends WeaponMod {
	public ModWizard() {
		super("Wizard", 4, true ,"Attacks deal 90% Physical Damage","Attacks deal 10% Magical Damage");
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
