import javax.swing.*;
import java.awt.*;

public class MainDisplay extends JFrame {
    public static void main(String[] args) {
        new DiceScreen();
        new SpellBookScreen();
        new BestiaryScreen();
        new JFrameCenterPositionTest();
    }
    public static class JFrameCenterPositionTest extends JFrame {
        public JFrameCenterPositionTest() {
            setTitle("JFrameCenter Position");
            add(new JLabel("JFrame set to center of the screen", SwingConstants.CENTER),
                    BorderLayout.CENTER);
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
