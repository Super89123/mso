package msotest._;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;




public class rabbits1 implements CommandExecutor, Listener {
int rr = 0;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        @NotNull String a = sender.getName();
        switch (rr){
            case 0:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit " + a);
                rr = rr++;
                break;
            case 1:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit1 " + a);
                rr = rr++;
                break;
            case 2:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit2 " + a);
                rr = rr++;
                break;
            case 3:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit3 " + a);
                rr = rr++;
                break;
            case 4:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit4 " + a);
                rr = rr++;
                break;
            case 5:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit5 " + a);
                rr = rr++;
                break;
            default:
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "warp rabbit99");
        }
        return true;

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        rr = rr--;

    }
}






