package net.kingdomsofarden.andrew2060.toolhandler.mods.armormods;

import java.util.Iterator;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;
import com.herocraftonline.heroes.characters.skill.Skill;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ArmorMod;

public class ModSleipnir extends ArmorMod {

    public ModSleipnir() {
        super(UUID.fromString("c01b5165-b60e-11e3-a5e2-0800200c9a66"), "Sleipnir", 1, true, ChatColor.YELLOW + "On-Hit: " + ChatColor.GRAY + "25% incoming damage is returned as AOE");
        this.setProtBonus(-5.00);
    }

    @Override
    public void executeOnArmorDamage(WeaponDamageEvent event) {
        if(event.isCancelled()) {
            return;
        }
        Entity target = event.getEntity();
        Iterator<Entity> near = target.getNearbyEntities(3, 3, 3).iterator();
        Player p = (Player) event.getEntity();
        while(near.hasNext()) {
            Entity next = near.next();
            if(!(next instanceof LivingEntity)) {
                continue;
            } else {
                LivingEntity lE = (LivingEntity)next;
                if(next == target || lE == event.getDamager().getEntity() ) {
                    continue;
                }
                if(!Skill.damageCheck(p, lE)) {
                    continue;
                } else {
                    Skill.damageEntity(lE, p, event.getDamage()*0.25, DamageCause.ENTITY_ATTACK);
                }
            }
        }
        return;
    }

    @Override
    public void executeOnTick(Player p) {
        return;
    }

}
