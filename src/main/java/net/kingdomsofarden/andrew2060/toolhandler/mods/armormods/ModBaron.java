package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;
import net.kingdomsofarden.andrew2060.toolhandler.util.ArmorLoreUtil;

public class ModBaron extends ArmorMod {

    public ModBaron(String name, String[] desc, int weight, boolean requiresSlot) {
        super("Baron", new String[] {"-5% Magic Resistance","-5% Health Regeneration","+7 Bonus Protection"}, 1, true);
    }

    @Override
    public void applyToArmor(ItemStack armor) {
        ArmorLoreUtil.addMagicResistRating(-5, armor);
        ArmorLoreUtil.addHealingBonus(-5, armor);
        ArmorLoreUtil.addProtBonus(7, armor);
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
