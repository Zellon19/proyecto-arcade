/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade.controllers;

import com.retrofighters.arcade.Emulator;
import com.retrofighters.arcade.Game;
import com.retrofighters.arcade.handlers.EmulatorHandler;
import java.io.IOException;

/**
 *
 * @author Retro Fighters
 */
// handles the emulator instance that is executed
public class EmulatorController {

    // returns true if the emulator instance starts correctly
    public boolean initiateEmulatorInstance(Emulator pEmulator, Game pGame) throws IOException, InterruptedException{
        return new EmulatorHandler().initializeEmulator(pEmulator, pGame);
    }
    
    public EmulatorController() {
    }
        
    
}
