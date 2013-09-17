package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModChasm extends WeaponMod {
	public ModChasm() {
		super("Chasm", 24, true,"Attacks deal 2 Bonus Magic Damage");
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		Skill.damageEntity((LivingEntity) event.getEntity(), event.getDamager().getEntity(), 2.0, DamageCause.MAGIC);
	}

}
