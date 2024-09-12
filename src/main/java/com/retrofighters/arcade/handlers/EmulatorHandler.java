/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade.handlers;

import com.retrofighters.arcade.Emulator;
import com.retrofighters.arcade.Game;

/**
 *
 * @author Retro Fighters
 */
//
//handles the execution of the emulator and correct instancing of the selected game
public class EmulatorHandler {
    private final String _emulatorPath = "C:\\RetroArch-Win64\\retroarch.exe";
    
    // initializes the emulator instance
    public boolean initializeEmulator(Emulator pEmulator, Game pGame){
        return true;
    }
    
    // add more methods that start the emulator and the correct game
}
