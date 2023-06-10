package BackEnd;

import BackEnd.NewGame;

public class Main {
    //Metoda main slúži len na spustenie aplikácie / Vytvorím new game a zavolám jej funkciu playGame()
    public static void main(String[] args) {
        NewGame newGame = new NewGame();
        newGame.playGame();
    }
}