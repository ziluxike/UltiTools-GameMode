package com.ultikits.plugins.heal.service;

import com.ultikits.ultitools.interfaces.Registrable;
import org.bukkit.entity.Player;

/**
 * Author: ziluxike
 * Time: 2023/1/30 06:13
 */
public interface GameModeService extends Registrable {
    void toSurvival(Player player);
    void toCreative(Player player);
    void toAdventure(Player player);
    void toSpectator(Player player);
}
