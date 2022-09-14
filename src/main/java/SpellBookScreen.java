import com.google.gson.JsonObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpellBookScreen extends JFrame implements ActionListener {
    SpellBookScreen() {
        JFrame jFrame;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton getSpellButton = new JButton("Get Spell");

        JTextField spellTextField = new JTextField();
        String[] spellStrings = {"fireball", "animate-dead", "cloudkill"};
        JComboBox comboBox = new JComboBox(spellStrings);

        JLabel chooseASpell = new JLabel("Choose a spell:");
        JLabel spellTextSpace = new JLabel("...");


        getSpellButton.addActionListener(e -> {
            JButton src = (JButton) e.getSource();
            String spellName = (String) comboBox.getSelectedItem();
            try {

                spellTextSpace.setText(CallSpellBookApi.getSpellFromApi(spellName));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        chooseASpell.setBounds(20, 10, 200, 40);
        comboBox.setBounds(20, 90, 200, 40);
        getSpellButton.setBounds(220, 40, 100, 40);
        spellTextField.setBounds(20, 40, 200, 40);
        spellTextSpace.setBounds(20, 70, 200, 40);

        add(getSpellButton);
        add(chooseASpell);
        add(comboBox);
        add(spellTextField);
        add(spellTextSpace);
        setSize(500, 500);
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

// Need to get separate parts of call, assign variable names. Set those as different
// text areas. Can format later. Can I do this all from one call?