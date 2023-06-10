package BackEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerWin extends JFrame {

    public PlayerWin(String winPlayer) {
        // Nastavenie vlastnost� okna
        setTitle("Vyhral hr��");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Vytvorenie a pridanie n�pisu s v�hrou hr��a
        JLabel winLabel = new JLabel("Player " + winPlayer + " WIN");
        winLabel.setHorizontalAlignment(JLabel.CENTER);
        add(winLabel);

        // Vytvorenie a pridanie tla�idla OK
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Zatvori� okno
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}