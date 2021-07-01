package me.lbuddyboy.menu.example;

import me.lbuddyboy.menu.object.Button;
import me.lbuddyboy.menu.object.Menu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LBuddyBoy (lbuddyboy.me)
 * 30/06/2021 / 8:46 PM
 * MenuAPI / me.lbuddyboy.menu.example
 */
public class MenuExample extends Menu {
	@Override
	public String name() {
		return "testmenu";
	}

	@Override
	public String title(Player player) {
		return "Example";
	}

	@Override
	public List<Button> buttons(Player player) {

		List<Button> buttons = new ArrayList<>();
		buttons.add(new Button() {
			@Override
			public ItemStack stack(Player player) {
				return new ItemStack(Material.DIAMOND);
			}

			@Override
			public void action(Player player, int slot, InventoryClickEvent event) {
				player.sendMessage(ChatColor.RED + "Exampleeeeee");
			}

			@Override
			public int slot() {
				return 5;
			}
		});

		return buttons;
	}

	@Override
	public int size() {
		return 9;
	}

	@Override //Doesn't work yet (Working on it)
	public boolean autoUpdate() {
		return false;
	}
}
