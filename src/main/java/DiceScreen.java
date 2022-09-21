import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;

public class DiceScreen extends JFrame {
    DiceScreen() {
        JFrame jFrame;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel mostRecentRoll = new JLabel("Click a button to roll a die!");

        List<JButton> buttonList = new ArrayList<>();
        String[] buttonTypes = {"D4", "D6", "D8", "D10", "D12", "D20", "D100"};
        int y = 20;
        for (int i = 0; i < 7; i++) {
            JButton button = new JButton(buttonTypes[i]);
            String buttonType = buttonTypes[i].toLowerCase();
            buttonList.add(button);
            button.setBounds(20, y, 100, 40);
            button.addActionListener(e -> {
                JButton src = (JButton) e.getSource();
                mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + RollDice.rollDie(buttonType) + "!");
            });
            add(button);
            y += 45;
        }

        mostRecentRoll.setBounds(20, 335, 200, 40);
        add(mostRecentRoll);
        setSize(200, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DiceScreen();
    }
}