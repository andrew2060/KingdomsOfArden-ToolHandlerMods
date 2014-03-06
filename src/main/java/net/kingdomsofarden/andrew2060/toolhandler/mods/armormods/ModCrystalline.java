package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.Random;
import java.util.UUID;

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
        super(UUID.fromString("14112ee4-a4d9-11e3-be40-425861b86ab6"),"Crystalline", 20, true, "Basic Attacks have a 5% chance of being reflected for 100% of damage");
        setMagicResist(2.00);
        setHealingBonus(10.00);
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
        // TODO Auto-generated method stub

    }

}
