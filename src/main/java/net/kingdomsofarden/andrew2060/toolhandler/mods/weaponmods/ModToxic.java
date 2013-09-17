package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.Iterator;
import java.util.Random;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

public class ModToxic extends WeaponMod {
	Random rand;

	public ModToxic() {
		super("Toxic", 2, true,"Attacks Have a 20% Chance","Of Dealing Splash Poison");
		this.rand = new Random();
		setBonusDamage(5.00);
		setLifeSteal(2.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled()) {
			return;
		}
		if(rand.nextInt(100) >= 20) {
			return;
		}
		Player p = (Player) event.getDamager().getEntity();
		Iterator<Entity> near = p.getNearbyEntities(5, 5, 5).iterator();
		while(near.hasNext()) {
			Entity next = near.next();
			if(!(next instanceof LivingEntity)) {
				continue;
			} else {
				LivingEntity lE = (LivingEntity)next;
				if(!Skill.damageCheck(p, lE)) {
					continue;
				} else {
					pEMan.addPotionEffectStacking(PotionEffectType.POISON.createEffect(40, 1),lE,false);
				}
			}
		}
	}

}
