package gui;
import javax.swing.JOptionPane;

public class messagedisplay {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("enter your name here to get a pro");
        JOptionPane.showMessageDialog(null,"thisis your name "+ name);
        float age= Float.parseFloat(JOptionPane.showInputDialog("enter your age arounfd it"));
        JOptionPane.showMessageDialog(null,"your are younge to take risks you are just"+age+"years old");
    }


}
