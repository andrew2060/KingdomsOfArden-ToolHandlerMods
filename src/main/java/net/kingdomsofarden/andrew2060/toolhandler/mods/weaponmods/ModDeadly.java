package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.CharacterTemplate;
import com.herocraftonline.heroes.characters.effects.ExpirableEffect;

import net.kingdomsofarden.andrew2060.toolhandler.ToolHandlerPlugin;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModDeadly extends WeaponMod {

	private Heroes heroesPlugin;

	public ModDeadly() {
		super(UUID.fromString("c82c87a3-a1de-11e3-a5e2-0800200c9a66"),"Deadly", 4, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.RED + "-100% " + ChatColor.GRAY + "Target Healing (D: 1s)");
		this.heroesPlugin = (Heroes) Bukkit.getPluginManager().getPlugin("Heroes");
		Bukkit.getPluginManager().registerEvents(new HealingListener(heroesPlugin), ToolHandlerPlugin.instance);
		setBonusDamage(5.00);
	}
	
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		CharacterTemplate cT = heroesPlugin.getCharacterManager().getCharacter((LivingEntity) event.getEntity());
		cT.addEffect(new ExpirableEffect(null, heroesPlugin, "DeadlyModEffect", 1000L));
		return;
	}
	public class HealingListener implements Listener {
		private Heroes heroes;

		public HealingListener(Heroes heroesPlugin) {
			this.heroes = heroesPlugin;
		}

		@EventHandler(ignoreCancelled = true)
		public void onHeroRegainHealth(EntityRegainHealthEvent event) {
			if(!(event.getEntity() instanceof LivingEntity)) {
				return;
			}
			CharacterTemplate cT = heroes.getCharacterManager().getCharacter((LivingEntity)event.getEntity());
			if(cT.hasEffect("DeadlyModEffect")) {
				event.setCancelled(true);
			}
		}
	}

}
