import javax.swing.JFrame;
import GameModule.Graphics.assets.GamePanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("I Entered the Dungeon as a Farmer: Tale of Two Brothers");

        GamePanel gp = new GamePanel();
        frame.add(gp);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        gp.setupGame();
        gp.startGameThread();
    }
}