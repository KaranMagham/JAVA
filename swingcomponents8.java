import javax.swing.*;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Demo");
        
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JCheckBox checkbox = new JCheckBox("Remember Me");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(checkbox);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");

        JPanel panel = new JPanel();
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);

        frame.add(panel);
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Demo");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        JPanel panel = new JPanel();
        panel.add(r1);
        panel.add(r2);

        frame.add(panel);
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

