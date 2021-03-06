package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.Random;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.CharacterTemplate;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.ToolHandlerPlugin;
import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModCrystalline extends ArmorMod {

    Random rand;
    
    public ModCrystalline() {
        super(UUID.fromString("14112ee4-a4d9-11e3-be40-425861b86ab6"),"Crystalline", 8, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+5% " + ChatColor.GRAY + "Chance of Attack Reflection");
        setMagicResist(2.00);
        setKnockbackResist(10.00);
        rand = new Random();
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        if(rand.nextInt(100) < 5) {
            CharacterTemplate cT = ToolHandlerPlugin.instance.heroesPlugin.getCharacterManager().getCharacter((LivingEntity) event.getEntity());
            ToolHandlerPlugin.instance.heroesPlugin.getDamageManager().addSpellTarget(event.getDamager().getEntity(),cT,null);
            Skill.damageEntity(event.getDamager().getEntity(), cT.getEntity(), event.getDamage(), event.getCause());
        }
    }

    @Override
    public void executeOnTick(Player p) {
    }

}
