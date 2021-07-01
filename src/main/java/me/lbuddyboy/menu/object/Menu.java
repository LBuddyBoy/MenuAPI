package me.lbuddyboy.menu.object;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.List;

public abstract class Menu {

	public abstract String name();
	public abstract String title(Player player);
	public abstract List<Button> buttons(Player player);
	public abstract int size();
	public abstract boolean autoUpdate();

	public void openMenu(Player player) {
		Inventory i = Bukkit.createInventory(null, size(), title(player));
		for (Button b : buttons(player)) {
			i.setItem(b.slot(), b.stack(player));
		}
		player.openInventory(i);
	}

//	public void updateMenu(Menu menu) {
//
//	}

}
