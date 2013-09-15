package net.kingdomsofarden.andrew2060.toolhandler.mods.weapon;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModWizard extends WeaponMod {
	public ModWizard() {
		super("Wizard", new String[] {"+5 Bonus Damage","Attacks deal 90% Physical Damage","Attacks deal 10% Magical Damage"}, 4, true);
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5,weapon);
		return;
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
