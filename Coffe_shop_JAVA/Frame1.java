import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Frame1 extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JLabel fa;

    Frame1() {
        setLayout(null); // Use null layout for absolute positioning
        ImageIcon aa = new ImageIcon("5.jpg");
        fa = new JLabel(aa);
        fa.setBounds(0, 0, aa.getIconWidth(), aa.getIconHeight());
        setContentPane(fa);

        setTitle("COFFEE SHOP - Main Menu");
        setSize(800, 600); // Initial size for small screens
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        b1 = new JButton("MENU");
        b2 = new JButton("Table Booking");
        b3 = new JButton("Coffee Delivered at Home");

        fa.add(b1);
        fa.add(b2);
        fa.add(b3);

        adjustComponentSizes();
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                adjustComponentSizes();
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    private void adjustComponentSizes() {
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        
        int buttonWidth = frameWidth / 2 - 100;
        int buttonHeight = frameHeight / 6;

        b1.setBounds(frameWidth / 4 - buttonWidth / 2, frameHeight / 2 - buttonHeight - 20, buttonWidth, buttonHeight);
        b2.setBounds(frameWidth / 4 * 3 - buttonWidth / 2, frameHeight / 2 - buttonHeight - 20, buttonWidth, buttonHeight);
        b3.setBounds(frameWidth / 2 - buttonWidth / 2, frameHeight / 2 + 20, buttonWidth, buttonHeight);
        
        fa.setBounds(0, 0, frameWidth, frameHeight);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            // Open the Menu frame
            Menu m = new Menu();
            setVisible(false);
        }
        if (ae.getSource() == b2) {
            // Open the table booking frame
            table t = new table();
        }
        if (ae.getSource() == b3) {
            JOptionPane.showMessageDialog(null, "Select coffee");
            Menu2 m = new Menu2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Frame1();
    }
}


