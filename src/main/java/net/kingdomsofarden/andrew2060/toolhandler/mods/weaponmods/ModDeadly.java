package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.CharacterTemplate;
import com.herocraftonline.heroes.characters.effects.ExpirableEffect;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModDeadly extends WeaponMod {

	private Heroes heroesPlugin;

	public ModDeadly() {
		super("Deadly", new String[] {"+5 Bonus Damage","Attacks apply a 1 Second 100% Healing Debuff"}, 4, true);
		this.heroesPlugin = (Heroes) Bukkit.getPluginManager().getPlugin("Heroes");
		Bukkit.getPluginManager().registerEvents(new HealingListener(heroesPlugin), Bukkit.getPluginManager().getPlugin("KingdomsOfArden-ToolHandler"));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+5, weapon);
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
