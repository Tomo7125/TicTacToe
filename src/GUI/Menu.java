package GUI;

import BackEnd.NewGame;
import BackEnd.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    private Frame frame;
    private NewGame newGame;
    private JPanel menuPanel;
    private JTextField textFieldPlayer1Name;
    private JTextField textFieldPlayer2Name;
    private JButton goToGameButton;
    private JLabel p1Meno;
    private JLabel p2Meno;


    //Kon�truktor pre menu ktor�mu dod�m na vstupe frame a ovladaciu triedu , prid�m actionlistener na button
    public Menu(Frame frame, NewGame newGame) {
        this.frame = frame;
        this.newGame = newGame;
        goToGameButton.addActionListener(this);
    }

    // Ak je kliknut� na button skontrolujem �i s� vyplnen� polia pre men� hr��ov ak ano tak ich nasetujem moj�m objektom player1 a player2
    // Na konci zavolam menu a metodu ktor� dod� nov� obsah pre okno
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(goToGameButton)){
            if (!textFieldPlayer1Name.getText().isEmpty() && !textFieldPlayer2Name.getText().isEmpty()){
                newGame.getPlayer1().setName(textFieldPlayer1Name.getText());
                newGame.getPlayer2().setName(textFieldPlayer2Name.getText());
                frame.setContext(new Game(frame , newGame).getContent());
            }
        }
    }
    // Metoda vracia tento menuPanel pri zavolani sa teda znovu otvori okno menu
    public JPanel getContent(){
        return this.menuPanel;
    }
}
