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


    public Menu(Frame frame, NewGame newGame) {
        this.frame = frame;
        this.newGame = newGame;
        goToGameButton.addActionListener(this);
    }

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

    public JPanel getContent(){
        return this.menuPanel;
    }
}
