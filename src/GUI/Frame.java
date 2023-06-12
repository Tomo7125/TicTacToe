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
        //Kon�truktor okna ktor� ma na vstupe metodu ktora bude obsluhova� okno
        // Obsahuje zakladne prikazy na na�t�lovanie okna
        public Frame(NewGame newGame) {
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setSize(1300,800);

            //Vytvor�m si nove menu a zavolam jeho metodu ktora mi dod� obsah okna
            menu = new Menu(this,newGame);
            setContentPane(menu.getContent());

            // Z�skanie ve�kosti obrazovky
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            // V�po�et strednej polohy pre okno
            int centerX = (screenSize.width - menu.getFrame().getWidth()) / 2;
            int centerY = (screenSize.height - menu.getFrame().getHeight()) / 2;

            // Nastavenie poz�cie okna na stred obrazovky
            menu.getFrame().setLocation(centerX, centerY);


            setVisible(true);
        }



        //Metoda nastavy obsah okna
        public void setContext(JPanel novyContext){
            setContentPane(novyContext);
            revalidate();
            repaint();
        }
    }
