
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class Menu extends JFrame implements ActionListener {
//     JButton b1;
//     JLabel background, titleLabel;

//     Menu() {
//         setTitle("Menu for coffee delivery");
//         setSize(1100, 800); // Initial size for small screens
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Set background image
//         ImageIcon bgImage = new ImageIcon("menu1.jpg");
//         background = new JLabel(bgImage) {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 super.paintComponent(g);
//                 Image img = bgImage.getImage();
//                 Dimension size = getSize();
//                 g.drawImage(img, 0, 0, size.width, size.height, this);
//             }
//         };
//         background.setLayout(new GridBagLayout());
//         setContentPane(background);

//         // Create title label
//         titleLabel = new JLabel("Coffee Menu");
//         titleLabel.setFont(new Font("Courier New", Font.BOLD, 40));
//         titleLabel.setForeground(Color.WHITE); // Assuming the background image has a darker color

//         // Create BACK button
//         b1 = new JButton("BACK");
//         b1.setFont(new Font("Arial", Font.BOLD, 18));
//         b1.addActionListener(this);

//         // Add components to the layout
//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.insets = new Insets(5, 10, 5, 10); // Adjust vertical padding

//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         gbc.gridwidth = 4;
//         gbc.anchor = GridBagConstraints.CENTER;
//         background.add(titleLabel, gbc);

//         // BACK button at the bottom
//         gbc.gridy = 1;
//         gbc.gridwidth = 1;
//         gbc.anchor = GridBagConstraints.LINE_START; // Align LEFT
//         background.add(b1, gbc);

//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent ae) {
//         if (ae.getSource() == b1) {
//             new Frame1();
//             setVisible(false);
//         }
//     }

//     public static void main(String[] args) {
//         new Menu();
//     }
// }
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    JButton b1;
    JLabel background, titleLabel;

    Menu() {
        setTitle("Menu for coffee delivery");
        setSize(1100, 800); // Initial size for small screens
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Set background image
        ImageIcon bgImage = new ImageIcon("menu1.jpg");
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

        // Create title label
        titleLabel = new JLabel("Coffee Menu");
        titleLabel.setFont(new Font("Courier New", Font.BOLD, 40));
        titleLabel.setForeground(Color.WHITE); // Assuming the background image has a darker color

        // Create BACK button
        b1 = new JButton("BACK");
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.addActionListener(this);

        // Add components to the layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(5, 10, 5, 10); // Corrected import for Insets

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        background.add(titleLabel, gbc);

        // BACK button at the bottom
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER; // Align LEFT
        background.add(b1, gbc);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Frame1();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
