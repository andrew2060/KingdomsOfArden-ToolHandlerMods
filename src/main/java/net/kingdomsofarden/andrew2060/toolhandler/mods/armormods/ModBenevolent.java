package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.ArmorLoreUtil;

public class ModBenevolent extends ArmorMod {

    public ModBenevolent() {
        super("Benevolent", new String[] {"+2.5% Magic Resistance","+12% Health Regen"}, 8, true);
    }

    @Override
    public void applyToArmor(ItemStack armor) {
        ArmorLoreUtil.addMagicResistRating(2.5, armor);
        ArmorLoreUtil.addHealingBonus(12, armor);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        return;
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
