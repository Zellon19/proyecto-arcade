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
    //private final String _testRomPath = "\"C:\\Users\\56125894\\Desktop\\proyecto arcade\\proyecto-arcade\\src\\main\\java\\com\\retrofighters\\arcade\\assets\\ROMs\\atari\\spaceInvadersAtari.a26\" "; // space invaders for atari
    private final String _testRomPath = "C:\\Users\\RetroFighters\\Desktop\\Repo\\proyecto-arcade\\src\\main\\java\\com\\retrofighters\\arcade\\assets\\ROMs\\atari\\spaceInvadersAtari.a26"; // space invaders for atari
    
    // initializes the emulator instance
    public boolean initializeEmulator(Emulator pEmulator, Game pGame) throws IOException, InterruptedException{
        /*ProcessBuilder processBuilder = new ProcessBuilder(
            _retroArchPath,
            "--libretro=", _corePath,
            _testRomPath
        );*/
        String comando[] = {_retroArchPath,
            "-L", _corePath,
            _testRomPath}; 
        String comando2 = _retroArchPath + " -L " + _corePath + " " + _testRomPath;
        //processBuilder.redirectErrorStream(true);
        Process proceso;
        try {
            //Process process = processBuilder.start();
            proceso = new ProcessBuilder(comando).start();
            proceso.waitFor();
            /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                 System.out.println(line); // Print output to console
                }
            }
            int exitCode = process.waitFor();
            System.out.println("Process finished with code: " + exitCode);*/
        } catch (IOException | InterruptedException ex) {
            throw ex;
        }
        return true;
    }
    
    // add more methods that start the emulator and the correct game
}
