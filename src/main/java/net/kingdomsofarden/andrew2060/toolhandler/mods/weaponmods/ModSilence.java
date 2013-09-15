package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.SkillUseEvent;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.CharacterTemplate;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.effects.ExpirableEffect;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModSilence extends WeaponMod {

	private Heroes heroesPlugin;

	public ModSilence() {
		super("Silence", new String[] {"+2 Bonus Damage","Attacks silence target for 5 Seconds", "Only Triggers Once Every 30 Seconds"}, 2, true);
		this.heroesPlugin = (Heroes) Bukkit.getPluginManager().getPlugin("Heroes");
		Bukkit.getPluginManager().registerEvents(new SilenceListener(), Bukkit.getPluginManager().getPlugin("KingdomsOfArden-ToolHandler"));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+2, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		if(event.isCancelled() || !(event.getEntity() instanceof LivingEntity)) {
			return;
		}
		CharacterTemplate cT = heroesPlugin.getCharacterManager().getCharacter((LivingEntity) event.getEntity());
		if(!cT.hasEffect("SilenceEffectCD")) {
			cT.addEffect(new ExpirableEffect(null, heroesPlugin, "SilenceEffectCD", 30000L));
			cT.addEffect(new ExpirableEffect(null, heroesPlugin, "SilenceEffect", 5000L));
		}
		return;
	}
	public class SilenceListener implements Listener {
		@EventHandler(ignoreCancelled = true)
		public void onSkillUse(SkillUseEvent event) {
			Hero h = event.getHero();
			if(h.hasEffect("SilenceEffect")) {
				event.setCancelled(true);
				h.getPlayer().sendMessage(ChatColor.GRAY + "Silenced!");
			}
		}
	}

}
