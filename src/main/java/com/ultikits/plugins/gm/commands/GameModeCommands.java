package com.ultikits.plugins.gm.commands;

import com.ultikits.plugins.gm.PluginMain;
import com.ultikits.plugins.gm.service.GameModeService;
import com.ultikits.ultitools.abstracts.AbstractPlayerCommandExecutor;
import com.ultikits.ultitools.abstracts.UltiToolsPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Optional;

public class GameModeCommands extends AbstractPlayerCommandExecutor {
    @Override
    protected boolean onPlayerCommand(Command command, String[] strings, Player player) {
        Optional<GameModeService> service = UltiToolsPlugin.getPluginManager().getService(GameModeService.class);

        if (!service.isPresent()) {
            throw new RuntimeException("未能找到模式切换服务！");
        }

        GameModeService gameModeService = service.get();

        if (strings.length == 0) {
            return false;
        }

        switch (strings[0]) {
            case "0":
                gameModeService.toSurvival(player);
                break;
            case "1":
                gameModeService.toCreative(player);
                break;
            case "2":
                gameModeService.toAdventure(player);
                break;
            case "3":
                gameModeService.toSpectator(player);
                break;
            default:
                return false;
        }

        return true;
    }

    @Override
    protected void sendHelpMessage(CommandSender sender) {
        String help = "§2==== 游戏模式切换功能 ====\n" +
                "§6/gm 0 §4切换为生存模式\n" +
                "§6/gm 1 §4切换为创造模式\n" +
                "§6/gm 2 §4切换为冒险模式\n" +
                "§6/gm 3 §4切换为旁观模式\n";
        sender.sendMessage(PluginMain.getPluginMain().i18n(help));
    }


}
