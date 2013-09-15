package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import java.util.Iterator;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

public class ModGoliath extends WeaponMod {

	public ModGoliath() {
		super("Goliath", new String[] {"+5 Bonus Damage","+1% Life Steal","Attacks deal 3 Splash Magic Damage"}, 8, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon) + 5, weapon);
		WeaponLoreUtil.setLifeSteal(WeaponLoreUtil.getLifeSteal(weapon) + 1, weapon);
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
