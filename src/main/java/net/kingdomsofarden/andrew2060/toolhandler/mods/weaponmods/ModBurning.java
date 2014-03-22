package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.HeroRegainHealthEvent;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.CharacterTemplate;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.effects.ExpirableEffect;

import net.kingdomsofarden.andrew2060.toolhandler.ToolHandlerPlugin;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModBurning extends WeaponMod {

	private Heroes heroesPlugin;

	public ModBurning() {
		super(UUID.fromString("5eff2d02-a1de-11e3-a5e2-0800200c9a66"),"Burning", 12, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-50% " + ChatColor.GRAY + " Target Healing (D: 3s)");
		this.heroesPlugin = (Heroes) Bukkit.getPluginManager().getPlugin("Heroes");
		Bukkit.getPluginManager().registerEvents(new HealingListener(), ToolHandlerPlugin.instance);
		setCritChance(7.00);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		CharacterTemplate cT = heroesPlugin.getCharacterManager().getCharacter((LivingEntity) event.getEntity());
		cT.addEffect(new ExpirableEffect(null, heroesPlugin, "BurningModEffect", 3000L));
		return;
	}
	public class HealingListener implements Listener {
		@EventHandler(ignoreCancelled = true)
		public void onHeroRegainHealth(HeroRegainHealthEvent event) {
			Hero h = event.getHero();
			if(h.hasEffect("BurningModEffect")) {
				event.setAmount(event.getAmount()*0.5);
			}
		}
	}

	
}
