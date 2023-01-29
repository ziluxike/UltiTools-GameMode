package com.ultikits.plugins.heal.service;

import com.ultikits.plugins.heal.PluginMain;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

/**
 * Author: ziluxike
 * Time: 2023/1/30 06:14
 */
public class GameModeServiceImpl implements GameModeService{
    @Override
    public String getName() {
        return "游戏模式切换";
    }

    @Override
    public String getAuthor() {
        return "ziluxike";
    }

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public void toSurvival(Player player) {
        player.setGameMode(GameMode.SURVIVAL);
        player.sendMessage(ChatColor.YELLOW + PluginMain.getPluginMain().i18n("成功切换为生存模式!"));
    }

    @Override
    public void toCreative(Player player) {
        player.setGameMode(GameMode.CREATIVE);
        player.sendMessage(ChatColor.YELLOW + PluginMain.getPluginMain().i18n("成功切换为创造模式!"));
    }

    @Override
    public void toAdventure(Player player) {
        player.setGameMode(GameMode.ADVENTURE);
        player.sendMessage(ChatColor.YELLOW + PluginMain.getPluginMain().i18n("成功切换为冒险模式!"));
    }

    @Override
    public void toSpectator(Player player) {
        player.setGameMode(GameMode.SPECTATOR);
        player.sendMessage(ChatColor.YELLOW + PluginMain.getPluginMain().i18n("成功切换为旁观模式!"));
    }
}
