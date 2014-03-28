package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.Random;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.Hero;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModEthereal extends ArmorMod {

    final Random rand;
    
    public ModEthereal() {
        super(UUID.fromString("e2ae10d2-b604-11e3-9f3b-425861b86ab6"), "Ethereal", 1, true, ChatColor.AQUA + "Bonus: " + ChatColor.GRAY + "10% chance that an incoming attack will miss completely");
        this.setMagicResist(2.00);
        this.setProtBonus(-1.00);
        this.rand = new Random();
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        if(rand.nextDouble() >= 0.9) {
            event.setCancelled(true);
            if(event.getDamager() instanceof Hero) {
                ((Hero)event.getDamager()).getPlayer().sendMessage(ChatColor.GRAY + "Attack Missed!");
            }
        }
        return;
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
