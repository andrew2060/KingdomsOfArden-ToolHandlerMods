package net.kingdomsofarden.andrew2060.toolhandler.mods.toolmods;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ToolMod;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.block.BlockBreakEvent;


import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModTunneler extends ToolMod {

	public ModTunneler() {
		super(UUID.fromString("e3007350-a717-11e3-846f-425861b86ab6"),"Tunneler", 1, true, "Also breaks blocks above and below the block being broken. Will not work on obsidian");
	}

	@Override
	public void applyToTool(ItemStack tool) {
		return;
	}

	@Override
	public void executeOnBlockBreak(BlockBreakEvent event) {
		if(event.isCancelled()) {
			return;
		}
		List<Block> toBreak = new LinkedList<Block>();
		Block b = event.getBlock();
		toBreak.add(b);
		
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		// TODO Auto-generated method stub
		
	}


}
