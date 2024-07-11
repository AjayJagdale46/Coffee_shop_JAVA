// import java.awt.*; 
// import java.awt.event.*;
// import javax.swing.*;

// public class login extends JFrame implements ActionListener {
//     JButton b1, b2, b3;
//     JTextField t1, t2;
//     JLabel l1, l2, bg, l;

//     login() {
//         setLayout(null);

//         ImageIcon i = new ImageIcon("3.jpg");
//         JLabel bg = new JLabel(i);
//         bg.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
//         setContentPane(bg);

//         setTitle("COFFEE SHOP");
        
//         b1 = new JButton("Login");
//         b2 = new JButton("Reset");
//         b3 = new JButton("Exit");
        
//         l = new JLabel("Make your account"); 
//         Font f = new Font("Times New Roman", Font.BOLD, 28);
//         l.setFont(f);
//         l.setForeground(Color.black);
        
//         l1 = new JLabel("Username:");
//         l2 = new JLabel("Password:");
//         Font o = new Font("Bold Italic", Font.BOLD, 20);
//         l1.setFont(o);
//         l2.setFont(o);
        
//         l1.setForeground(Color.red);
//         l2.setForeground(Color.red);
        
//         t1 = new JTextField(20);
//         t2 = new JPasswordField(20);
        
//         l.setBounds(200, 100, 350, 40);
//         l1.setBounds(200, 150, 150, 40);
//         t1.setBounds(350, 150, 180, 40);
        
//         l2.setBounds(200, 200, 150, 40);
//         t2.setBounds(350, 200, 180, 40);
        
//         b1.setBounds(230, 250, 90, 30);
//         b2.setBounds(350, 250, 90, 30);
//         b3.setBounds(290, 300, 90, 30);
        
//         bg.add(l);      
//         bg.add(b1);
//         bg.add(b2);
//         bg.add(b3);
//         bg.add(l1);
//         bg.add(t1);
//         bg.add(l2);
//         bg.add(t2);
        
//         setSize(600, 400);
//         setVisible(true);
        
//         t1.addActionListener(this);
//         t2.addActionListener(this);
//         b1.addActionListener(this);
//         b2.addActionListener(this);
//         b3.addActionListener(this);
//     }
    
//     public void actionPerformed(ActionEvent ae) {
//         String a = t1.getText();
//         String b = new String(((JPasswordField) t2).getPassword());
//         if (ae.getSource() == b1) {
//             if (a.equals("Ajay") && b.equals("4622")) {
//                 JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
//                  //Open next frame here, e.g.:
//                  Frame1 l = new Frame1();
//                  setVisible(false);
//             } else {
//                 JOptionPane.showMessageDialog(null, "LOG IN NOT SUCCESSFUL");
//             }
//         }
//         if (ae.getSource() == b2) {
//             t1.setText("");
//             t2.setText("");
//         }
//         if (ae.getSource() == b3) {
//             System.exit(0);
//         }
//     }

//     public static void main(String args[]) {
//         new login();
//     }
// }

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JTextField t1, t2;
    JLabel l1, l2, bg, l;

    login() {
        setLayout(null);

        ImageIcon i = new ImageIcon("3.jpg");
        JLabel bg = new JLabel(i);
        bg.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
        setContentPane(bg);

        setTitle("COFFEE SHOP");

        b1 = new JButton("Login");
        b2 = new JButton("Reset");
        b3 = new JButton("Exit");

        l = new JLabel("Make your account");
        Font f = new Font("Times New Roman", Font.BOLD, 28);
        l.setFont(f);
        l.setForeground(Color.black);

        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");
        Font o = new Font("Bold Italic", Font.BOLD, 20);
        l1.setFont(o);
        l2.setFont(o);

        l1.setForeground(Color.red);
        l2.setForeground(Color.red);

        t1 = new JTextField(20);
        t2 = new JPasswordField(20);

        l.setBounds(200, 100, 350, 40);
        l1.setBounds(200, 150, 150, 40);
        t1.setBounds(350, 150, 180, 40);

        l2.setBounds(200, 200, 150, 40);
        t2.setBounds(350, 200, 180, 40);

        b1.setBounds(230, 250, 90, 30);
        b2.setBounds(350, 250, 90, 30);
        b3.setBounds(290, 300, 90, 30);

        bg.add(l);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(l1);
        bg.add(t1);
        bg.add(l2);
        bg.add(t2);

        setSize(800, 600);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);

        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String a = t1.getText();
        String b = new String(((JPasswordField) t2).getPassword());
        if (ae.getSource() == b1) {
            if (a.equals("Ajay") && b.equals("4622")) {
                JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
                Frame1 l = new Frame1();
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "LOG IN NOT SUCCESSFUL");
            }
        }
        if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        }
        if (ae.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new login();
    }
}
