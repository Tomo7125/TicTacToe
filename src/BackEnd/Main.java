package BackEnd;

import BackEnd.NewGame;

public class Main {
    //Metoda main sl��i len na spustenie aplik�cie / Vytvor�m new game a zavol�m jej funkciu playGame()
    public static void main(String[] args) {
        NewGame newGame = new NewGame();
        newGame.playGame();
    }
}