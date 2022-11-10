package urusia.urusia;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Urusia extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("urusai")) {
            for (int i = 0; i <= 2147483647; i++) {
                sender.sendMessage("うるｒしあ「");
            }
            return true;
        }
        return false;
    }
}
