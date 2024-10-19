package GameModule.Graphics.mainMenu;

import GameModule.Graphics.assets.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenHandler implements ActionListener {
    //static MainMenu frame = new MainMenu();
    private JFrame frame;

    public TitleScreenHandler(JFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //start game screen;
        //frame.setVisible(false);
        frame.dispose();

        JFrame gameScreen;

        gameScreen = new JFrame();

        gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen.setResizable(false);
        gameScreen.setTitle("I Entered the Dungeon as a Farmer: Tale of Two Brothers");

        GamePanel gp = new GamePanel();
        gameScreen.add(gp);
        gameScreen.pack();

        gameScreen.setLocationRelativeTo(null);
        gameScreen.setVisible(true);

        gp.setupGame();
        gp.startGameThread();
    }
}
