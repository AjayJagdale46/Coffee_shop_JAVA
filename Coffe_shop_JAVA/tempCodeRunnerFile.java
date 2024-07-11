import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Menu2 extends JFrame implements ItemListener, ActionListener {
    JCheckBox l1, l2, l3, l4, l5, l6, l7, l8;
    JButton b1, b2;
    JLabel background;

    Menu2() {
        setTitle("Menu for coffee delivery");
        setSize(1100, 800); // Initial size for small screens
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Set background image
        ImageIcon bgImage = new ImageIcon("menu11.jpg");
        background = new JLabel(bgImage) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = bgImage.getImage();
                Dimension size = getSize();
                g.drawImage(img, 0, 0, size.width, size.height, this);
            }
        };
        background.setLayout(new GridBagLayout());
        setContentPane(background);

        // Set font for checkboxes
        Font menuFont = new Font("Courier New", Font.BOLD, 18);

        // Create checkboxes for the menu
        l1 = new JCheckBox("ESPRESSO");
        l2 = new JCheckBox("ESPRESSO MACCHIATO");
        l3 = new JCheckBox("ESPRESSO CONPANA");
        l4 = new JCheckBox("AMERICANO");
        l5 = new JCheckBox("CAFFE LATTE");
        l6 = new JCheckBox("CAPPUCCINO");
        l7 = new JCheckBox("CAFFE MOCHA");
        l8 = new JCheckBox("CARAMEL MACCHIATO");

        JCheckBox[] checkboxes = { l1, l2, l3, l4, l5, l6, l7, l8 };
        for (JCheckBox cb : checkboxes) {
            cb.setFont(menuFont);
            //cb.setOpaque(false); // Make background transparent
            cb.addItemListener(this);
        }

        // Create buttons
        b1 = new JButton("BACK");
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.addActionListener(this);
        
        b2 = new JButton("Confirmed");
        b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.addActionListener(this);
      
        // Add components to the layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(10, 10, 10, 10); // Add padding

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
  
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // First row of checkboxes
        gbc.gridy = 1;
        background.add(l1, gbc);

        gbc.gridx++;
        background.add(l2, gbc);

        gbc.gridx++;
        background.add(l3, gbc);

        gbc.gridx++;
        background.add(l4, gbc);

        // Second row of checkboxes
        gbc.gridx = 0;
        gbc.gridy = 2;
        background.add(l5, gbc);

        gbc.gridx++;
        background.add(l6, gbc);

        gbc.gridx++;
        background.add(l7, gbc);

        gbc.gridx++;
        background.add(l8, gbc);

        // Buttons at the bottom
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        background.add(b2, gbc);

        gbc.gridx = 2;
        background.add(b1, gbc);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        // Handle item state changes if necessary
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Frame1();
            setVisible(false);
        }
        
        if (ae.getSource() == b2) {
            new Address();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Menu2();
    }
}
