package GUI;

import BackEnd.NewGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {
    private Frame frame;
    private NewGame newGame;
    private JPanel game;
    private JButton array11;
    private JButton array12;
    private JButton array13;
    private JButton array21;
    private JButton array22;
    private JButton array23;
    private JButton array31;
    private JButton array33;
    private JButton array32;
    private JLabel player2Score;
    private JLabel player1Score;
    private JButton restartButton;
    private JLabel nextPlayer;

    ImageIcon iconX = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\X.jpg");
    ImageIcon iconO = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\O.jpg");
    ImageIcon iconFree = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\free.jpg");

    public Game(Frame frame, NewGame newGame) {
        this.frame = frame;
        this.newGame = newGame;
        array11.addActionListener(this);
        array12.addActionListener(this);
        array13.addActionListener(this);
        array21.addActionListener(this);
        array22.addActionListener(this);
        array23.addActionListener(this);
        array31.addActionListener(this);
        array32.addActionListener(this);
        array33.addActionListener(this);

        player1Score.setText("X - " + newGame.getPlayer1().getName() + " : " + newGame.getPlayer1().getScore());
        player2Score.setText("O - " + newGame.getPlayer2().getName() + " : " + newGame.getPlayer2().getScore());

        array11.setIcon(iconFree);
        array12.setIcon(iconFree);
        array13.setIcon(iconFree);
        array21.setIcon(iconFree);
        array22.setIcon(iconFree);
        array23.setIcon(iconFree);
        array31.setIcon(iconFree);
        array32.setIcon(iconFree);
        array33.setIcon(iconFree);

        int randNumber = (Math.random() <= 0.5) ? 1 : 2;   //tento kod mi da 1 alebo 2 a podla toho budem urèova nahodne kto zaèína
        nextPlayer.setText("Na rade je : " + ((randNumber < 2) ? newGame.getPlayer1().getName() : newGame.getPlayer2().getName())); // sem budem vipisovat nahodne kto zacina a potm sa to bude po kazdom kole strieda
    }

    private void nextP1(){nextPlayer.setText("Na rade je : " + newGame.getPlayer1().getName());}
    private void nextP2(){nextPlayer.setText("Na rade je : " + newGame.getPlayer2().getName());}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(restartButton)){
            newGame.getPlayer1().setScore(0);
            newGame.getPlayer2().setScore(0);
        }
        if (e.getSource().equals(array11)){
            if(array11.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array11.setIcon(iconX);
                    nextP2();
                }else {array11.setIcon(iconO); nextP1();}
            }
        }
        if (e.getSource().equals(array12)){
            if (array12.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array12.setIcon(iconX);
                    nextP2();
                } else {array12.setIcon(iconO);nextP1();}
            }
        }
        if (e.getSource().equals(array13)){
            if (array13.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array13.setIcon(iconX);
                    nextP2();
                } else {array13.setIcon(iconO);nextP1();}
            }
        }if (e.getSource().equals(array21)){
            if (array21.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array21.setIcon(iconX);
                    nextP2();
                } else {array21.setIcon(iconO);nextP1();}
            }
        }if (e.getSource().equals(array22)){
            if (array22.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array22.setIcon(iconX);
                    nextP2();
                } else {array22.setIcon(iconO);nextP1();}
            }
        }if (e.getSource().equals(array23)){
            if (array23.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array23.setIcon(iconX);
                    nextP2();
                } else {array23.setIcon(iconO);nextP1();}
            }
        }if (e.getSource().equals(array31)){
            if (array31.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array31.setIcon(iconX);
                    nextP2();
                } else {array31.setIcon(iconO);nextP1();}
            }
        }if (e.getSource().equals(array32)){
            if (array32.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array32.setIcon(iconX);
                    nextP2();
                } else {array32.setIcon(iconO);nextP1();}
            }
        }if (e.getSource().equals(array33)){
            if (array33.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("Na rade je : " + newGame.getPlayer1().getName())) {
                    array33.setIcon(iconX);
                    nextP2();
                } else {array33.setIcon(iconO);nextP1();}
            }
        }
    }
    public JPanel getContent(){
        return this.game;
    }
}
