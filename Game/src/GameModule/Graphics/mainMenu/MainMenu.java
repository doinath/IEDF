package GameModule.Graphics.mainMenu;

import javax.swing.*;
import java.awt.*;



public class MainMenu {
    JFrame frame;
    Container con;
    JPanel titlePanel;
    JLabel titleLabel;

    public MainMenu() {

        frame = new JFrame();
        frame.setSize(768, 384);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        con = frame.getContentPane();

        titlePanel = new JPanel();
        titlePanel.setBounds(50, 50, 768, 384); // x, y, width, height
        titlePanel.setBackground(Color.red);
        titleLabel = new JLabel("OTEN");
        titleLabel.setForeground(Color.white);
        titlePanel.add(titleLabel);
        con.add(titlePanel);

    }
}
