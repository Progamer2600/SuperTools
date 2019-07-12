package me.progamer260.supertools.tools;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Pickaxe {

    private ItemMeta superPickMeta;
    private List pickLore = new ArrayList<String>();

    public ItemStack givePick () {
        ItemStack superPick = new ItemStack(Material.DIAMOND_PICKAXE);
        superPickMeta = superPick.getItemMeta();

        pickLore.add(ChatColor.GOLD + "Shift + Right Click with this pickaxe");
        pickLore.add(ChatColor.GOLD + "to toggle Area Break (Breaks Blocks in a 3x3 radius)");

        superPickMeta.setDisplayName(ChatColor.AQUA + "Super Pickaxe");
        superPickMeta.setLore(pickLore);
        superPickMeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        superPickMeta.setUnbreakable(true);
        superPick.setItemMeta(superPickMeta);
        pickLore.clear();

        return superPick;
    }
}
