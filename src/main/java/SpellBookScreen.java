import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpellBookScreen extends JFrame implements ActionListener {
    SpellBookScreen() {
        JFrame jFrame;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton getSpellButton = new JButton("Get Spell Info");

//        JTextField spellTextField = new JTextField();
        String[] spellStrings = {"fireball", "animate-dead", "cloudkill"};
        JComboBox<String> comboBox = new JComboBox<>(spellStrings);

        JLabel chooseASpell = new JLabel("Choose a spell:");
        JLabel spellNameSpace = new JLabel("...");
        JLabel spellDescriptionSpace = new JLabel();
        JLabel spellHigherLevelSpace = new JLabel();
        JLabel spellRangeSpace = new JLabel();
        JLabel spellComponentSpace = new JLabel();
        JLabel spellMaterialSpace = new JLabel();
        JLabel spellRitualSpace = new JLabel();
        JLabel spellDurationSpace = new JLabel();
        JLabel spellConcentrationSpace = new JLabel();
        JLabel spellCastingTimeSpace = new JLabel();


        getSpellButton.addActionListener(e -> {
            JButton src = (JButton) e.getSource();
            String spellName = (String) comboBox.getSelectedItem();
            try {
                JSONObject jsonArray = CallApi.getJsonObjectFromApi("spells", spellName);
                spellNameSpace.setText("Name: " + jsonArray.get("name").toString());
                spellDescriptionSpace.setText("Description: " + jsonArray.get("desc").toString());
                spellHigherLevelSpace.setText("Higher Level: " + jsonArray.get("higher_level").toString());
                spellRangeSpace.setText("Range: " + jsonArray.get("range").toString());
                spellComponentSpace.setText("Components: " + jsonArray.get("components").toString());
                if (!jsonArray.has("material")) {
                    spellMaterialSpace.setText("Material: None");
                } else {
                    spellMaterialSpace.setText("Material: " + jsonArray.get("material").toString());
                }
                spellRitualSpace.setText("Ritual? " + jsonArray.get("ritual").toString());
                spellDurationSpace.setText("Duration: " + jsonArray.get("duration").toString());
                spellConcentrationSpace.setText("Concentration? " + jsonArray.get("concentration").toString());
                spellCastingTimeSpace.setText("Casting Time: " + jsonArray.get("casting_time").toString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });


        int xBounds = 20;
        int yBounds = 10;
        chooseASpell.setBounds(xBounds, yBounds, 200, 40);
        comboBox.setBounds(xBounds, yBounds + 30, 200, 40);
        getSpellButton.setBounds(xBounds + 200, yBounds + 30, 100, 40);
//        spellTextField.setBounds(xBounds, 40, 200, 40);
        spellNameSpace.setBounds(xBounds, yBounds + 60, 200, 40);
        spellDescriptionSpace.setBounds(xBounds, 110, 200, 40);
        spellHigherLevelSpace.setBounds(xBounds, 150, 200, 40);
        spellRangeSpace.setBounds(xBounds, 190, 200, 40);
        spellComponentSpace.setBounds(xBounds, 230, 200, 40);
        spellMaterialSpace.setBounds(xBounds, 270, 200, 40);
        spellRitualSpace.setBounds(xBounds, 310, 200, 40);
        spellDurationSpace.setBounds(xBounds, 350, 200, 40);
        spellConcentrationSpace.setBounds(xBounds, 390, 200, 40);
        spellCastingTimeSpace.setBounds(xBounds, 430, 200, 40);

        add(getSpellButton);
        add(chooseASpell);
        add(comboBox);
//        add(spellTextField);
        add(spellNameSpace);
        add(spellDescriptionSpace);
        add(spellHigherLevelSpace);
        add(spellRangeSpace);
        add(spellComponentSpace);
        add(spellMaterialSpace);
        add(spellRitualSpace);
        add(spellDurationSpace);
        add(spellConcentrationSpace);
        add(spellCastingTimeSpace);
        setSize(500, 500);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new SpellBookScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        JComboBox jComboBox = (SpellBookScreen).e.getSource;
    }
}