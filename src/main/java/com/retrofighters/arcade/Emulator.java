/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade;

import java.util.ArrayList;

/**
 *
 * @author Retro Fighters
 */
public class Emulator {
    private int _id;
    private String _name;
    private String _path;

    private static ArrayList<Emulator> _emulatorList = new ArrayList<>();
    // ^^^^ actually do a database look up for this shit
    
    public int getId() {
        return _id;
    }
    public void setId(int _id) {
        this._id = _id;
    }
    public String getName() {
        return _name;
    }
    public void setName(String _name) {
        this._name = _name;
    }
    public String getPath() {
        return _path;
    }
    public void setPath(String _path) {
        this._path = _path;
    }
    
    public void initializeData(){
        String atariEmuPath = "C:\\RetroArch-Win64\\cores\\stella_libretro.dll";
        String nesEmuPath = "C:\\RetroArch-Win64\\cores\\fceumm_libretro.dll";

        String atariEmuName = "Atari - 2600 (Stella)";
        String nesEmuName = "Nintendo - NES / Famicom *(FCEUmm)";
                
        Emulator atariEmulator = new Emulator(1, atariEmuName, atariEmuPath);
        Emulator nesEmulator = new Emulator(2, nesEmuName, nesEmuPath);
        
        this.addEmulator(atariEmulator);
        this.addEmulator(nesEmulator);
    }
    
    // look up an emulator having the object
    public Emulator searchEmulator(Emulator pEmulator){
        for(Emulator emu : this.emulatorList())
            if(emu.getId() == pEmulator.getId())
                return emu;
        
        return null;
    }   
    // look up an emulator having just its id
    public Emulator searchEmulator(int pId){
        for(Emulator emu : this.emulatorList())
            if(emu.getId() == pId)
                return emu;
        
        return null;       
    } 
    // look up an emulator locally (only used in add/delete/update methods)
    private Emulator searchEmulator(){
        for(Emulator emu : this.emulatorList())
            if(emu.getId() == this.getId())
                return emu;
        
        return null;
    }
    
    // adds an emulator to the list if it exists
    public boolean addEmulator(Emulator pEmulator){
        if(pEmulator.searchEmulator() == null)
            return this.emulatorList().add(pEmulator);
        
        return false;
    }
    
    // deletes an emulator from the list if it exists
    public boolean removeEmulator(Emulator pEmulator){
        if(pEmulator.searchEmulator() == null)
            return false;
        
        return this.emulatorList().remove(pEmulator);
    }
    
    // modifies an emulator from the list if it exists
    public boolean modifyEmulator(Emulator pEmulator){
        if(pEmulator.searchEmulator() == null)
            return false;
    
        // IF it deletes the emulator (with old data) adds it again (with new data)
        if(this.emulatorList().remove(pEmulator.searchEmulator()))
            return this.emulatorList().add(pEmulator);
        
        return false;
    }
    
    public ArrayList<Emulator> emulatorList(){
        return Emulator._emulatorList;
    }
    
    public Emulator(int pId, String pName, String pPath){
        this._id = pId;
        this._name = pName;
        this._path = pPath;
    }
    
    public Emulator(){
        
    }
}
