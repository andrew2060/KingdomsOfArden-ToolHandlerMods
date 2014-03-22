package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.Iterator;
import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

public class ModBeserk extends WeaponMod {

	public ModBeserk() {
		super(UUID.fromString("f978e161-a1dd-11e3-a5e2-0800200c9a66"),"Beserk", 2, true, ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+5" + ChatColor.GRAY + " Magic Splash Damage");
		setBonusDamage(5.00);
		setLifeSteal(2.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
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
					Skill.damageEntity(lE, p, 5.0, DamageCause.MAGIC);
				}
			}
		}
	}

}
