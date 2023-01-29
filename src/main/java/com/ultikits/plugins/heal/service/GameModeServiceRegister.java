package com.ultikits.plugins.heal.service;

import com.ultikits.ultitools.abstracts.ServiceRegister;
import com.ultikits.ultitools.interfaces.Registrable;

/**
 * Author: ziluxike
 * Time: 2023/1/30 06:18
 */
public class GameModeServiceRegister extends ServiceRegister<GameModeService> {
    public GameModeServiceRegister(Class<GameModeService> api, Registrable service) {
        super(api, service);
    }

}
