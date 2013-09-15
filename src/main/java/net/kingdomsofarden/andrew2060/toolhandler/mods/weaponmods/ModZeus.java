package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.events.CriticalStrikeEvent;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.WeaponLoreUtil;

public class ModZeus extends WeaponMod {

	public class ModListener implements Listener {
		@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
		public void onCritStrike(CriticalStrikeEvent event) {
			if(!event.getMods().contains("Zeus")) {
				return;
			}
			Location loc = event.getEvent().getEntity().getLocation();
			loc.getWorld().strikeLightningEffect(loc);
		}
	}

	public ModZeus() {
		super("Zeus", new String[] {"+3 Bonus Damage","+5% Critical Strike Chance","Critical Strikes cause Lightning"}, 2, true);
		Bukkit.getPluginManager().registerEvents(new ModListener(), Bukkit.getPluginManager().getPlugin("KingdomsOfArden-ToolHandler"));
	}

	@Override
	public void applyToWeapon(ItemStack weapon) {
		WeaponLoreUtil.setBonusDamage(WeaponLoreUtil.getBonusDamage(weapon)+3,weapon);
		WeaponLoreUtil.setCritChance(WeaponLoreUtil.getCritChance(weapon)+5, weapon);
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}

}
