package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModSacred extends WeaponMod {
	public ModSacred() {
		super("Sacred", new String[] {"+4 Bonus Damage","+1% Life Steal","Attacks deal 2 Bonus Magic Damage","When Opponent has a Higher Percent Health"}, 24, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon) + 4, weapon);
		WeaponLoreUtil.setLifeSteal(WeaponLoreUtil.getLifeSteal(weapon) + 1, weapon);
		return;
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		LivingEntity lE = (LivingEntity) event.getEntity();
		LivingEntity aE = event.getDamager().getEntity();
		if((lE.getHealth()/lE.getMaxHealth()) > (aE.getHealth()/aE.getMaxHealth())) {
			Skill.damageEntity(lE, event.getDamager().getEntity(), 2.0, DamageCause.MAGIC);
		}
	}

}
