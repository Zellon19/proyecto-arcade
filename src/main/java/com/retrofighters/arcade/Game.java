/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retrofighters.arcade;

/**
 *
 * @author axela
 */
public class Game {
    public int _id;
    public String _name;
    public String _console;
    public String _year;
    public String _path;
    public String _developer;
    public Emulator _emulator;

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
    public String getConsole() {
        return _console;
    }
    public void setConsole(String _console) {
        this._console = _console;
    }
    public String getYear() {
        return _year;
    }
    public void setYear(String _year) {
        this._year = _year;
    }
    public String getPath() {
        return _path;
    }
    public void setPath(String _path) {
        this._path = _path;
    }
    public String getDeveloper() {
        return _developer;
    }
    public void setDeveloper(String _developer) {
        this._developer = _developer;
    }
    public Emulator getEmulator() {
        return _emulator;
    }
    public void setEmulator(Emulator _emulator) {
        this._emulator = _emulator;
    }

    public Game(int pId, String pName, String pConsole, String pYear, String pPath, String pDeveloper, Emulator pEmulator) {
        this._id = pId;
        this._name = pName;
        this._console = pConsole;
        this._year = pYear;
        this._path = pPath;
        this._developer = pDeveloper;
        this._emulator = pEmulator;
    }
    
}
