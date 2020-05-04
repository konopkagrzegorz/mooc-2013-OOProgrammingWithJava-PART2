package greeter.ui;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(new UserInterface());
    }
}
