package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;



import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModValkyrie extends WeaponMod {
	public ModValkyrie() {
		super("Valkyrie",2,true,"Attacks Increase Jump Height for 2 Seconds");
		this.addPotionEffectsSelf(PotionEffectType.JUMP.createEffect(40, 2));
		setBonusDamage(5.00);
		setCritChance(10.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {		
	    return;
	}
}
