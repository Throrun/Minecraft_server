package myfirstplugin.myfirstplugin.magmacube_login_system;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import myfirstplugin.myfirstplugin.MyFirstPlugin;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginSystem implements CommandExecutor {
    String global_password = "test";
    public LoginSystem(MyFirstPlugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void (PlayerJoinEvent event) {

    }
}