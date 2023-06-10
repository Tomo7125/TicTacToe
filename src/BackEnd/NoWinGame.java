package BackEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NoWinGame extends JFrame {

    public NoWinGame() {
        // Nastavenie vlastnostÌ okna
        setTitle("NoWin");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Vytvorenie a pridanie n·pisu s v˝hrou hr·Ëa
        JLabel winLabel = new JLabel("This game ended in a draw");
        winLabel.setHorizontalAlignment(JLabel.CENTER);
        add(winLabel);

        // Vytvorenie a pridanie tlaËidla OK
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Zatvoriù okno
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}