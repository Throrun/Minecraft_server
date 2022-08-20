package myfirstplugin.myfirstplugin.magmacube_login_system;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import myfirstplugin.myfirstplugin.MyFirstPlugin;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class Login implements CommandExecutor {
    String global_password = "test";
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("Only players can run this command.");
            return true;
        }
        Player player = (Player) sender;
        if(args[0]=="login"||args[0]=="l"&&args[1]==global_password) {
            PlayerLoginEvent.Result.ALLOWED;
            sender.sendMessage("Logged in correctly :)");
        }else if(args.length!=2||args[0]!="login"&&args[0]!="l"){
            sender.sendMessage("Wrong command, write /help for command list");
        }else{
            sender.sendMessage("Wrong password!");
        }
    }
}