package BackEnd;

import GUI.Frame;
import GUI.Game;

import javax.swing.*;
import java.awt.*;

public class NewGame {

    private Player player1 = new Player();
    private Player player2 = new Player();

    //Tu si vytvor�m moj�ch hr��ov
    public Player getPlayer1() {
        return player1;
    }
    public Player getPlayer2() {
        return player2;
    }

    //Metoda vytvor� okno a potom nadstav�m pozadie pre toto okno
    public void playGame(){

        Frame menu = new Frame(this);

        ImageIcon imageIcon = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\ticTacBG3.jpg");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, menu.getWidth(), menu.getHeight());
        menu.add(label);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - menu.getWidth()) / 2;
        int centerY = (screenSize.height - menu.getHeight()) / 2;
        menu.setLocation(centerX, centerY);

    }
}
