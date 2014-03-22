package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.herocraftonline.heroes.api.events.HeroRegainHealthEvent;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModJustice extends WeaponMod {

	public ModJustice() {
		super(UUID.fromString("c82c87ad-a1de-11e3-a5e2-0800200c9a66"),"Justice", 1, true, 
		        ChatColor.AQUA + "Bonus: " + ChatColor.GREEN + "+2% " + ChatColor.GRAY + "Target Max Health Damage",
		        ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+1% " + ChatColor.GRAY + "Target Max Health Self Heal");
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		LivingEntity lE = (LivingEntity) event.getEntity();
		LivingEntity dE = event.getDamager().getEntity();
		Skill.damageEntity(lE, dE, lE.getMaxHealth()*0.02, DamageCause.ENTITY_ATTACK);
		HeroRegainHealthEvent hEvent = new HeroRegainHealthEvent((Hero) event.getDamager(), lE.getMaxHealth()*0.01, null);
		Bukkit.getPluginManager().callEvent(hEvent);
		if(hEvent.isCancelled()) {
			return;
		}
		double newHealth = dE.getHealth() + hEvent.getAmount();
		if(newHealth > dE.getMaxHealth()) {
			newHealth = dE.getMaxHealth();
		}
		dE.setHealth(newHealth);
	}

}
