package com.jake.diamondsdebris;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakListener implements Listener {
    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        Location location = block.getLocation();

        if (block.getType() == Material.DIAMOND_ORE) {
            location.getWorld().dropItemNaturally(location, new ItemStack(Material.ANCIENT_DEBRIS));
            e.setDropItems(false);
        } else if (block.getType() == Material.ANCIENT_DEBRIS) {
            location.getWorld().dropItemNaturally(location, new ItemStack(Material.DIAMOND));
            e.setDropItems(false);
        }
    }
}
