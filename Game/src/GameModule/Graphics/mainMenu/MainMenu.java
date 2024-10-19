package GameModule.Graphics.mainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainMenu {
    JFrame frame = new JFrame();;
    Container con;
    JPanel titlePanel, startPanelButton;
    JLabel titleLabel;
    JButton startButton;
    TitleScreenHandler tscHandler = new TitleScreenHandler(frame);

    public MainMenu() {

        frame.setSize(768, 384);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.black);
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.setVisible(true);
        con = frame.getContentPane();

        startButton = new JButton("start");
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.red);

        startPanelButton = new JPanel();
        startPanelButton.setBounds(80,80, 200,200);
        startPanelButton.setBackground(Color.gray);
        startPanelButton.add(startButton);

        con.add(startPanelButton);
        startButton.addActionListener(tscHandler);

        titlePanel = new JPanel();
        titlePanel.setBounds(50, 50, 200, 250); // x, y, width, height
        titlePanel.setBackground(Color.blue);
        titleLabel = new JLabel("Tale of Two Brothers");
        titleLabel.setForeground(Color.black);
        titlePanel.add(titleLabel);
        con.add(titlePanel);

    }
}
