package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModCursed extends ArmorMod {

    public ModCursed() {
        super(UUID.fromString("5682c5f2-b61b-11e3-a5e2-0800200c9a66"), "Cursed", 4, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.GRAY + "Deals physical damage equal to 10% self max health");
        setMagicResist(-20.00);
        setProtBonus(-20.00);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        double damage = ((LivingEntity)event.getEntity()).getMaxHealth() * 0.05;
        Skill.damageEntity(event.getDamager().getEntity(), (LivingEntity)event.getEntity(), damage, DamageCause.ENTITY_ATTACK);
        return;
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
