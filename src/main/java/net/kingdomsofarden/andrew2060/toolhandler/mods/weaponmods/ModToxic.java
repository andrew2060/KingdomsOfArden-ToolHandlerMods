package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.Iterator;
import java.util.Random;
import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;




import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

public class ModToxic extends WeaponMod {
	Random rand;

	public ModToxic() {
		super(UUID.fromString("c82caeb7-a1de-11e3-a5e2-0800200c9a66"),"Toxic", 2, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Chance for Splash Poison");
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
