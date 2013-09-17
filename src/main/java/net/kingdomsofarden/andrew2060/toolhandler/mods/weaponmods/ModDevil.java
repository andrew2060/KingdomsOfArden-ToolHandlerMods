package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModDevil extends WeaponMod {

	public ModDevil() {
		super("Devil", 4, true, "Attacks deal 3 Bonus True Damage");
		setCritChance(5.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		Skill.damageEntity((LivingEntity) event.getEntity(), event.getDamager().getEntity(), 3.0, DamageCause.CUSTOM);		
	}

}
