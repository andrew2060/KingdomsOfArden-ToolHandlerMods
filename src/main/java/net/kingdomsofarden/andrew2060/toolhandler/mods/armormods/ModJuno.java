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

public class ModJuno extends ArmorMod {

    Random rand;
    
    public ModJuno() {
        super(UUID.fromString("14112ee4-a4d9-11e3-be40-425861b86ab6"),"Juno", 5, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.GREEN + "+10% " + ChatColor.GRAY + "Chance of Attack Reflection");
        setMagicResist(2.00);
        setKnockbackResist(10.00);
        setProtBonus(-2.00);
        rand = new Random();
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        if(rand.nextDouble() < 0.1) {
            CharacterTemplate cT = ToolHandlerPlugin.instance.heroesPlugin.getCharacterManager().getCharacter((LivingEntity) event.getEntity());
            ToolHandlerPlugin.instance.heroesPlugin.getDamageManager().addSpellTarget(event.getDamager().getEntity(),cT,null);
            Skill.damageEntity(event.getDamager().getEntity(), cT.getEntity(), event.getDamage(), event.getCause());
        }
    }

    @Override
    public void executeOnTick(Player p) {
    }

}
