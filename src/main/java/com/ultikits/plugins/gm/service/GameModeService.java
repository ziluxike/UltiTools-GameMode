package com.ultikits.plugins.gm.service;

import com.ultikits.ultitools.interfaces.Registrable;
import org.bukkit.entity.Player;

/**
 * Author: ziluxike
 * Time: 2023/1/30 06:13
 */
public interface GameModeService extends Registrable {
    /**
     * 设置玩家为生存模式
     * @param player 玩家
     */
    void toSurvival(Player player);

    /**
     * 设置玩家为创造模式
     * @param player 玩家
     */
    void toCreative(Player player);

    /**
     * 设置玩家为冒险模式
     * @param player 玩家
     */
    void toAdventure(Player player);

    /**
     * 设置玩家为旁观模式
     * @param player 玩家
     */
    void toSpectator(Player player);
}
