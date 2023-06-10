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
        //Konötruktor okna ktor˝ ma na vstupe metodu ktora bude obsluhovaù okno
        // Obsahuje zakladne prikazy na naöt˝lovanie okna
        public Frame(NewGame newGame) {
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setSize(1300,800);

            //VytvorÌm si nove menu a zavolam jeho metodu ktora mi dod· obsah okna
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
