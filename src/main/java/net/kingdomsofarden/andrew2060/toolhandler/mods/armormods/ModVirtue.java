package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModVirtue extends ArmorMod {

    public ModVirtue() {
        super(UUID.fromString("a7d0c9d1-b61a-11e3-a5e2-0800200c9a66"),"Virtue", 2, true, ChatColor.LIGHT_PURPLE + "Unique " + ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+20% " + ChatColor.GRAY + "Damage Boost (D: 1s)");
        this.applySelfOnDamage.add(PotionEffectType.INCREASE_DAMAGE.createEffect(20, 1));
        this.setProtBonus(3.00);
        this.setMagicResist(-1.50);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
