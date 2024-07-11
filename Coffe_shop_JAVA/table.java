
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class table extends JFrame implements ItemListener, ActionListener {

    Choice l3;
    JLabel l1, l2, l, l4;
    JTextField t1, t2;
    JButton b1, b2, b4;

    table() {
        setVisible(true);
        setSize(550, 400);
        setLocationRelativeTo(null); // Center the JFrame on screen
        setTitle("Table_Booking");

        JLabel bg = new JLabel(new ImageIcon("table.jpg"));
        l = new JLabel("BOOK YOUR TABLE");
        Font f = new Font("Courier New", Font.BOLD, 40);
        l.setFont(f);
        l.setForeground(Color.RED);

        l1 = new JLabel("Name:");
        l2 = new JLabel("Contact number:");
        l3 = new Choice();
        l4 = new JLabel("Select table:");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Book");
        b2 = new JButton("Cancel");
        b4 = new JButton("Exit");

        Font j = new Font("Courier New", Font.BOLD, 20);
        l1.setFont(j);
        l2.setFont(j);
        l4.setFont(j);
        l1.setForeground(Color.RED);
        l2.setForeground(Color.RED);
        l4.setForeground(Color.RED);

        l3.add("Table 1");
        l3.add("Table 2");
        l3.add("Table 3");
        l3.add("Table 4");
        l3.add("Table 5");
        l3.add("Table 6");

        l.setBounds(50, 50, 500, 50);
        l1.setBounds(80, 100, 100, 30);
                t1.setBounds(290, 100, 100, 30);
                l2.setBounds(80, 150, 200, 30);
                t2.setBounds(290, 150, 100, 30);
                l3.setBounds(290, 200, 100, 30);
                l4.setBounds(80, 200, 200, 30);
                b1.setBounds(100, 250, 100, 30);
                b2.setBounds(280, 250, 100, 30);
                b4.setBounds(190, 290, 100, 30);

        bg.setLayout(null); // Ensure layout manager is null for absolute positioning
        bg.add(l);
        bg.add(l1);
        bg.add(l2);
        bg.add(l3);
        bg.add(l4);
        bg.add(t1);
        bg.add(t2);
        bg.add(b1);
        bg.add(b2);
        bg.add(b4);

        add(bg);

        l3.addItemListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b4.addActionListener(this);

        // Add DocumentListener to restrict contact number field to 10 digits
        t2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                limitLength();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                limitLength();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                limitLength();
            }

            private void limitLength() {
                if (t2.getText().length() > 10) {
                    String limitedText = t2.getText().substring(0, 10);
                    t2.setText(limitedText);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String name = t1.getText().trim(); // Get the name from the text field
            String contactNumber = t2.getText().trim(); // Get the contact number from the text field
            String selectedTable = l3.getSelectedItem(); // Get the selected table

            if (!name.isEmpty() && !contactNumber.isEmpty() && selectedTable != null) {
                JOptionPane.showMessageDialog(null,
                     selectedTable + " booked for " + name + "\nContact Number: " + contactNumber);
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all fields and select a table");
            }
        }
        if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        }
        if (ae.getSource() == b4) {
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            table t = new table();
        });
    }
}
