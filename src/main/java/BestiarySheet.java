import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BestiarySheet extends JFrame implements ActionListener {
    BestiarySheet() {
        JFrame jFrame;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton getMonsterButton = new JButton("Get Monster Info");

//        JTextField monsterTextField = new JTextField();
        String[] monsterStrings = {"cockatrice", "adult-black-dragon", "aboleth"};
        JComboBox<String> comboBox = new JComboBox<>(monsterStrings);

        JLabel chooseAMonster = new JLabel("Choose a monster:");
        JLabel monsterNameSpace = new JLabel("...");
//        JLabel monsterDescriptionSpace = new JLabel();
//        JLabel monsterHigherLevelSpace = new JLabel();
//        JLabel monsterRangeSpace = new JLabel();
//        JLabel monsterComponentSpace = new JLabel();
//        JLabel monsterMaterialSpace = new JLabel();
//        JLabel monsterRitualSpace = new JLabel();
//        JLabel monsterDurationSpace = new JLabel();
//        JLabel monsterConcentrationSpace = new JLabel();
//        JLabel monsterCastingTimeSpace = new JLabel();


        getMonsterButton.addActionListener(e -> {
            JButton src = (JButton) e.getSource();
            String monsterName = (String) comboBox.getSelectedItem();
            try {
                JSONObject jsonArray = CallApi.getJsonObjectFromApi("monsters", monsterName);
                monsterNameSpace.setText("Name: " + jsonArray.get("name").toString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });


        int xBounds = 20;
        int yBounds = 10;
        chooseAMonster.setBounds(xBounds, yBounds, 200, 40);
        comboBox.setBounds(xBounds, yBounds + 30, 200, 40);
        getMonsterButton.setBounds(xBounds + 200, yBounds + 30, 100, 40);
//        monsterTextField.setBounds(xBounds, 40, 200, 40);
        monsterNameSpace.setBounds(xBounds, yBounds + 60, 200, 40);
//        monsterDescriptionSpace.setBounds(xBounds, 110, 200, 40);
//        monsterHigherLevelSpace.setBounds(xBounds, 150, 200, 40);
//        monsterRangeSpace.setBounds(xBounds, 190, 200, 40);
//        monsterComponentSpace.setBounds(xBounds, 230, 200, 40);
//        monsterMaterialSpace.setBounds(xBounds, 270, 200, 40);
//        monsterRitualSpace.setBounds(xBounds, 310, 200, 40);
//        monsterDurationSpace.setBounds(xBounds, 350, 200, 40);
//        monsterConcentrationSpace.setBounds(xBounds, 390, 200, 40);
//        monsterCastingTimeSpace.setBounds(xBounds, 430, 200, 40);

        add(getMonsterButton);
        add(chooseAMonster);
        add(comboBox);
//        add(monsterTextField);
        add(monsterNameSpace);
//        add(monsterDescriptionSpace);
//        add(monsterHigherLevelSpace);
//        add(monsterRangeSpace);
//        add(monsterComponentSpace);
//        add(monsterMaterialSpace);
//        add(monsterRitualSpace);
//        add(monsterDurationSpace);
//        add(monsterConcentrationSpace);
//        add(monsterCastingTimeSpace);
        setSize(500, 500);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BestiarySheet();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
