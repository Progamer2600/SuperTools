package me.progamer260.supertools.gui;

import me.progamer260.supertools.tools.Pickaxe;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ToolsGui  {

    public static Inventory toolsGui;
    private Pickaxe pickaxe = new Pickaxe();

    public void openGui (Player player) {
        toolsGui = Bukkit.createInventory(player, 9, ChatColor.AQUA + "SuperTools");
        toolsGui.setItem(4, pickaxe.givePick());

        player.openInventory(toolsGui);
    }
}
