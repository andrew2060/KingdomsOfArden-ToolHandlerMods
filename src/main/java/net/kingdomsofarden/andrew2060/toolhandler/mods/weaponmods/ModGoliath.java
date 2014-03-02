package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.Iterator;
import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

public class ModGoliath extends WeaponMod {

	public ModGoliath() {
		super(UUID.fromString("c82c87a9-a1de-11e3-a5e2-0800200c9a66"),"Goliath", 8, true, "Attacks deal 3 Splash Magic Damage");
		setBonusDamage(5.00);
		setLifeSteal(1.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled()) {
			return;
		}
		Entity target = event.getEntity();
		Iterator<Entity> near = target.getNearbyEntities(3, 3, 3).iterator();
		Player p = (Player) event.getDamager().getEntity();
		while(near.hasNext()) {
			Entity next = near.next();
			if(!(next instanceof LivingEntity)) {
				continue;
			} else {
				LivingEntity lE = (LivingEntity)next;
				if(next == target || lE == event.getDamager().getEntity() ) {
					continue;
				}
				if(!Skill.damageCheck(p, lE)) {
					continue;
				} else {
					Skill.damageEntity(lE, p, 3.0, DamageCause.MAGIC);
				}
			}
		}
	}

}
