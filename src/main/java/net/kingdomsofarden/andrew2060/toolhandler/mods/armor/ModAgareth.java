package net.kingdomsofarden.andrew2060.toolhandler.mods.armor;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.ArmorLoreUtil;

public class ModAgareth extends ArmorMod {

    public ModAgareth() {
        super("Agareth", new String[] {"+2.5% Magic Resistance" , "-1% Health Regeneration" , "+3 Bonus Protection"}, 12, true);
    }

    @Override
    public void applyToArmor(ItemStack armor) {
        ArmorLoreUtil.addMagicResistRating(2.5,armor);
        ArmorLoreUtil.addHealingBonus(-1, armor);
        ArmorLoreUtil.addProtBonus(3, armor);
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
