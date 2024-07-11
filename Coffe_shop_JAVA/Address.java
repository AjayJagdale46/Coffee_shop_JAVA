import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Address extends JFrame implements ActionListener {
    JLabel background,l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton b1, b2;

    Address() {
        setTitle("Details");
        setSize(600, 600);
        setLocationRelativeTo(null); // Center the window on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        ImageIcon bgImage = new ImageIcon("4.jpg");
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


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(10, 10, 10, 10); // Padding

        l1 = new JLabel("Name: ");
        l2 = new JLabel("Address: ");
        l3 = new JLabel("Contact no: ");
        l4 = new JLabel("E-mail: ");
        l5 = new JLabel("Sorry, but only COD payments");

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.WHITE);

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);

        b1 = new JButton("Confirm");
        b2 = new JButton("Back");

        gbc.anchor = GridBagConstraints.WEST;

        // Adding components to the layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(l1, gbc);

        gbc.gridx = 1;
        add(t1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(l2, gbc);

        gbc.gridx = 1;
        add(t2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(l3, gbc);

        gbc.gridx = 1;
        add(t3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(l4, gbc);

        gbc.gridx = 1;
        add(t4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(l5, gbc);

        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(b1, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(b2, gbc);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "Order confirmed");
        }

        if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            new Menu();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Address();
    }
}
