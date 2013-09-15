package net.kingdomsofarden.andrew2060.toolhandler.mods.tool;

import java.util.LinkedList;
import java.util.List;

import net.kingdomsofarden.andrew2060.toolhandler.mods.typedefs.ToolMod;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.herocraftonline.heroes.api.events.WeaponDamageEvent;

public class ModTunneler extends ToolMod {

	public ModTunneler() {
		super("Tunneler", new String[] {"Also breaks blocks above and below the block being broken. Will not work on obsidian"}, 1, true);
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
		Block b5 = event.getBlock();
		Block b8 = b5.getRelative(BlockFace.UP);
		Block b2 = b5.getRelative(BlockFace.DOWN);
		b8.breakNaturally();
		b2.breakNaturally();
		
	}

	@Override
	public void executeOnWeaponDamage(WeaponDamageEvent event) {
		// TODO Auto-generated method stub
		
	}


}
