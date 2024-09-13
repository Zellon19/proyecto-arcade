/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade.handlers;

import java.io.File;
import java.io.IOException;
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
    public boolean initializeEmulator(Emulator pEmulator, Game pGame) throws IOException, InterruptedException{
        ProcessBuilder processBuilder = new ProcessBuilder(_emulatorPath);
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Process finished with code: " + exitCode);
        } catch (Exception ex) {
            throw ex;
        }
        return true;
    }
    
    // add more methods that start the emulator and the correct game
}
