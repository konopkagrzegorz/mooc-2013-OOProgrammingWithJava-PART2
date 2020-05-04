package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    
    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(new JLabel("Are you?"));
        JCheckBox yesButton = new JCheckBox("Yes!");
        JCheckBox noButton = new JCheckBox("No!");
        
        JRadioButton noReasonButton = new JRadioButton("No reason.");
        JRadioButton funButton = new JRadioButton("Because it is fun!");

        ButtonGroup firstButtonGroup = new ButtonGroup();
        firstButtonGroup.add(yesButton);
        firstButtonGroup.add(noButton);
        
        ButtonGroup secondButtonGroup = new ButtonGroup();
        secondButtonGroup.add(noReasonButton);
        secondButtonGroup.add(funButton);

        container.add(yesButton);
        container.add(noButton);
        
        container.add(new JLabel("Why?"));
        container.add(noReasonButton);
        container.add(funButton);
        container.add(new JButton("Done!"));
    }


    public JFrame getFrame() {
        return frame;
    }
}
