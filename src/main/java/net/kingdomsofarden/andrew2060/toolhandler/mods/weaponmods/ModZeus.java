package net.kingdomsofarden.andrew2060.toolhandler.mods.weaponmods;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.ToolHandlerPlugin;
import net.kingdomsofarden.andrew2060.toolhandler.events.CriticalStrikeEvent;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.WeaponMod;

public class ModZeus extends WeaponMod {


	public ModZeus() {
		super("Zeus", 2, true, "Critical Strikes cause Lightning");
		Bukkit.getPluginManager().registerEvents(new ModListener(), ToolHandlerPlugin.instance);
		setBonusDamage(3.00);
		setCritChance(5.00);
	}

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
	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
	}

}
