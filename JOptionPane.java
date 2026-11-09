import javax.swing.JOptionPane;

public class Login {

    public static void main(String[] args) {

        // input username
        String username = JOptionPane.showInputDialog("Enter your username:");

        // input password
        String password = JOptionPane.showInputDialog("Enter your password:");

        // check if they match 
        if (username.equals("Hero") && password.equals("Zero")) {
            JOptionPane.showMessageDialog(null, "Access Granted");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }
    }
}
