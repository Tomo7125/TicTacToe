package GUI;

import BackEnd.NewGame;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;

    public class Frame extends JFrame {
        private Menu menu;
        //Konštruktor okna ktorý ma na vstupe metodu ktora bude riadi? program
        // Obsahuje zakladne prikazy na naštýlovanie okna
        public Frame(NewGame newGame) {
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setSize(1300,800);


            menu = new Menu(this,newGame);
            setContentPane(menu.getContent());


            setVisible(true);
        }



        //Metoda nastavy obsah okna
        public void setContext(JPanel novyContext){
            setContentPane(novyContext);
            revalidate();
            repaint();
        }
    }
