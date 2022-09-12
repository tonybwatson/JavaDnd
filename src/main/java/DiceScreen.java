import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceScreen extends JFrame {
    DiceScreen() {
        JFrame f;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton dFour = new JButton("D4");
        JButton dSix = new JButton("D6");
        JButton dEight = new JButton("D8");
        JButton dTen = new JButton("D10");
        JButton dTwelve = new JButton("D12");
        JButton dTwenty = new JButton("D20");
        JButton dOneHundred = new JButton("D100");

        JLabel mostRecentRoll = new JLabel("Click a button to roll a die!");

        dFour.setBounds(20, 20, 100, 40);
        dFour.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d4")));        });

        dSix.setBounds(20, 65, 100, 40);
        dSix.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d6")));        });

        dEight.setBounds(20, 110, 100, 40);
        dEight.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d8")));        });

        dTen.setBounds(20, 155, 100, 40);
        dTen.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d10")));        });

        dTwelve.setBounds(20, 200, 100, 40);
        dTwelve.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d12")));        });

        dTwenty.setBounds(20, 245, 100, 40);
        dTwenty.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d20")));        });

        dOneHundred.setBounds(20, 290, 100, 40);
        dOneHundred.addActionListener(e -> {
            JButton src = (JButton)e.getSource();
            mostRecentRoll.setText("Rolled a " + src.getText() + " and got " + String.valueOf(DiceRoll.rollDie("d100")));
        });

        mostRecentRoll.setBounds(20, 335, 200, 40);

        add(dFour);
        add(dSix);
        add(dEight);
        add(dTen);
        add(dTwelve);
        add(dTwenty);
        add(dOneHundred);
        add(mostRecentRoll);
        setSize(200, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new DiceScreen();
    }
}
