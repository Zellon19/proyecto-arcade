/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade.controllers;

import com.retrofighters.arcade.Emulator;
import com.retrofighters.arcade.Game;
import com.retrofighters.arcade.handlers.EmulatorHandler;

/**
 *
 * @author Retro Fighters
 */
// handles the emulator instance that is executed
public class EmulatorController {
    private int _emulatorId;

    public int getEmulatorId() {
        return _emulatorId;
    }
    public void setEmulatorId(int _emulatorId) {
        this._emulatorId = _emulatorId;
    }

    // returns true if the emulator instance starts correctly
    public boolean initiateEmulatorInstance(Emulator pEmulator, Game pGame){
        return new EmulatorHandler().initializeEmulator(pEmulator, pGame);
    }
    
    public EmulatorController(int pEmulatorId) {
        this._emulatorId = pEmulatorId;
    }
        
    
}
