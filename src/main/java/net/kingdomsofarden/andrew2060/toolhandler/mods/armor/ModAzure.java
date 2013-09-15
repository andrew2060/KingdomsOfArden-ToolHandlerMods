package net.kingdomsofarden.andrew2060.toolhandler.mods.armor;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModAzure extends ArmorMod {

    public ModAzure() {
        super("Azure", ChatColor.AQUA + "Unique: " + ChatColor.GRAY + "Being attacked speeds you up by 20% for 1 second", 4, true);
    }

    @Override
    public void applyToArmor(ItemStack armor) {
        return;
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
