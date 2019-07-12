package me.progamer260.supertools.commands;

import me.progamer260.supertools.gui.ToolsGui;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GuiCommand implements CommandExecutor {
    ToolsGui toolsGui = new ToolsGui();

    @Override
    public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
        sender.getServer().broadcastMessage("Test");
        if (command.getName().equalsIgnoreCase("supertools")) {
            System.out.println("1 passed");
            if (sender instanceof ConsoleCommandSender) {
                System.out.println(" 2 passed");
                sender.sendMessage(ChatColor.RED + "Console cannot run this command!");
            } else {
                System.out.println("2 passed");
                toolsGui.openGui((Player) sender);
            }
        }
        return false;
    }
}
