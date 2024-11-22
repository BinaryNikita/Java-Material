package assgn2;
import javax.swing.*;
import java.awt.event.*;


public class SimpleEventHandling extends JFrame implements ActionListener {
    private JButton button;

    public SimpleEventHandling() {
        // Step 3: Create and Add Components
        button = new JButton("Click Me");
        button.addActionListener(this);  // Register the button with the ActionListener
        
        this.add(button);
        
        // Step 4: Set JFrame Properties
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Step 5: Handle the Event
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new SimpleEventHandling();
    }
}

