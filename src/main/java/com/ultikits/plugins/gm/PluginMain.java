package com.ultikits.plugins.gm;

import com.ultikits.plugins.gm.commands.GameModeCommands;
import com.ultikits.plugins.gm.service.GameModeService;
import com.ultikits.plugins.gm.service.GameModeServiceImpl;
import com.ultikits.plugins.gm.service.GameModeServiceRegister;
import com.ultikits.ultitools.abstracts.UltiToolsPlugin;

import java.util.Arrays;
import java.util.List;

public class PluginMain extends UltiToolsPlugin {
    private static PluginMain pluginMain;
    private GameModeServiceRegister gameModeServiceRegister;

    public static PluginMain getPluginMain() {
        return pluginMain;
    }

    // 插件模块的启动方法，类比spigot插件的onEnable方法
    @Override
    public boolean registerSelf() {
        pluginMain = this;
        gameModeServiceRegister = new GameModeServiceRegister(GameModeService.class, new GameModeServiceImpl());
        getCommandManager().register(new GameModeCommands(), "", this.i18n("游戏模式切换"),"gm");
        return true;
    }

    // 插件模块的卸载方法，类比spigot插件的onDisable方法
    @Override
    public void unregisterSelf() {
        gameModeServiceRegister.unload();
    }

    // 插件模块的名称，随意取名，但是建议使用英文名，游戏内不会显示
    // 游戏内显示的仅为服务名（之后讲插件服务的时候会说）
    // 此方法只用于区别插件模块，请勿取过于大众化的名字
    @Override
    public String pluginName() {
        return "UltiTools-GameMode";
    }

    @Override
    public int minUltiToolsVersion() {
        return 0;
    }

    @Override
    public List<String> supported() {
        return Arrays.asList("zh", "en");
    }
}