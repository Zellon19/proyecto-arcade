/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade.controllers;

/**
 *
 * @author axela
 */
// handles the emulator instance that is executed
public class EmulatorController {
    private String _game;
    private int _emulatorId;
    
    private final String _emulatorPath = "C:\\RetroArch-Win64\\retroarch.exe";

    public String getGame() {
        return _game;
    }
    
    public void setGame(String _game) {
        this._game = _game;
    }

    public int getEmulatorId() {
        return _emulatorId;
    }

    public void setEmulatorId(int _emulatorId) {
        this._emulatorId = _emulatorId;
    }

    public EmulatorController(int pEmulatorId, String pGame) {
        this._emulatorId = pEmulatorId;
        this._game = pGame;
    }
        
    
}
