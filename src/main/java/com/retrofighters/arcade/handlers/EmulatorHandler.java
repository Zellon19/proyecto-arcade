/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade.handlers;

import java.io.File;
import java.io.IOException;
import com.retrofighters.arcade.Emulator;
import com.retrofighters.arcade.Game;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Retro Fighters
 */
//
//handles the execution of the emulator and correct instancing of the selected game

public class EmulatorHandler {
    private final String _retroArchPath = "C:\\RetroArch-Win64\\retroarch.exe ";
    private final String _corePath = "C:\\RetroArch-Win64\\cores\\stella_libretro.dll "; // atari stella emulator
    //private final String _testRomPath = "\"C:\\Users\\57260758\\Documents\\GitHub\\proyecto-arcade\\src\\main\\java\\com\\retrofighters\\arcade\\assets\\ROMs\\atari\\spaceInvadersAtari.a26\" "; // space invaders for atari
    private final String _testRomPath = "C:\\Users\\axela\\Desktop\\Repositorios\\Proyecto Arcade\\proyecto-arcade\\src\\main\\resources\\com\\retrofighters\\arcade\\assets\\ROMs\\atari\\spaceInvadersAtari.a26"; // space invaders for atari
    
    // initializes the emulator instance
    public boolean initializeEmulator(Emulator pEmulator, Game pGame) throws IOException, InterruptedException{
        String command[] = {
            _retroArchPath,
            "-L", _corePath,
            _testRomPath}; 
        Process process;
        try {
            //Process process = processBuilder.start();
            process = new ProcessBuilder(command).start();
            process.waitFor();
        } catch (IOException | InterruptedException ex) {
            throw ex;
        }
        return true;
    }
    
    // add more methods that start the emulator and the correct game
}
