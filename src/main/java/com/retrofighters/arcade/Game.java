
package com.retrofighters.arcade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Retro Fighters
 */
public class Game {
    private int _id;
    private String _name;
    private String _console;
    private String _year;
    private String _path;
    private String _developer;
    private Emulator _emulator;

   
    private static ArrayList<Game> _gameList = new ArrayList<>();
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
  
    public void initializeData(){
        String atariSpaceInvadersPath = "C:\\Users\\axela\\Desktop\\Repositorios\\Proyecto Arcade\\proyecto-arcade\\src\\main\\resources\\com\\retrofighters\\arcade\\assets\\ROMs\\atari\\spaceInvadersAtari.a26";
        Emulator atariEmu = new Emulator().searchEmulator(1);
        
        String nesTetrisPath = "C:\\Users\\axela\\Desktop\\Repositorios\\Proyecto Arcade\\proyecto-arcade\\src\\main\\resources\\com\\retrofighters\\arcade\\assets\\ROMs\\nintendones\\tetrisNES.nes";
        Emulator nesEmu = new Emulator().searchEmulator(2);
        
        Game spaceInvaders = new Game(1, "Space Invaders", "Atari 2600", "1978", atariSpaceInvadersPath, "Toshihiro Nishikado", atariEmu);
        Game tetris = new Game(2, "Tetris", "NES", "1984", nesTetrisPath, "Alekséi Pázhitnov", nesEmu);
        
        this.addGame(spaceInvaders);
        this.addGame(tetris);
    }

    // look up a game having the object
    public Game searchGame(Game pGame){
        for(Game game : this.gameList())
            if(game.getId() == pGame.getId())
                return game;
        
        return null;
    }   
    // look up a game having just its id
    public Game searchGame(int pId){
        for(Game game : this.gameList())
            if(game.getId() == pId)
                return game;
        
        return null;       
    } 
    // look up a game locally (only used in add/delete/update methods)
    private Game searchGame(){
        for(Game game : this.gameList())
            if(game.getId() == this.getId())
                return game;
        
        return null;
    }
    
    // adds a game to the list if it exists
    public boolean addGame(Game pGame){
        if(pGame.searchGame() == null)
            return this.gameList().add(pGame);
        
        return false;
    }
    
    // deletes a game from the list if it exists
    public boolean removeGame(Game pGame){
        if(pGame.searchGame() == null)
            return false;
        
        return this.gameList().remove(pGame);
    }
    
    // modifies a game from the list if it exists
    public boolean modifyEmulator(Game pGame){
        if(pGame.searchGame() == null)
            return false;
    
        // IF it deletes the game (with old data) adds it again (with new data)
        if(this.gameList().remove(pGame.searchGame()))
            return this.gameList().add(pGame);
        
        return false;
    }
    
    public ArrayList<Game> gameList(){
        return Game._gameList;
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
    
    public Game(){
        
    }
    
}
