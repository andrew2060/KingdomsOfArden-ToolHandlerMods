package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;



import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.api.events.SkillUseEvent;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.CharacterTemplate;
import com.herocraftonline.heroes.characters.Hero;
import com.herocraftonline.heroes.characters.effects.ExpirableEffect;

import net.kingdomsofarden.andrew2060.toolhandler.ToolHandlerPlugin;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;


public class ModSilence extends WeaponMod {

	private Heroes heroesPlugin;

	public ModSilence() {
		super("Silence", 2, true, "Attacks silence target for 5 Seconds", "Only Triggers Once Every 30 Seconds");
		this.heroesPlugin = ToolHandlerPlugin.instance.heroesPlugin;
		Bukkit.getPluginManager().registerEvents(new SilenceListener(), ToolHandlerPlugin.instance);
		setBonusDamage(2.00);
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
