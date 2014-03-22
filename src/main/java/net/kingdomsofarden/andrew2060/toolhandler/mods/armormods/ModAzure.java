package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModAzure extends ArmorMod {

    public ModAzure() {
        super(UUID.fromString("14114064-a4d9-11e3-be40-425861b86ab6"),"Azure", 4, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Self Speed (D: 1s)");
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        LivingEntity lE = (LivingEntity) event.getEntity();
        pEMan.addPotionEffectStacking(PotionEffectType.SPEED.createEffect(20, 1),lE,false);
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
