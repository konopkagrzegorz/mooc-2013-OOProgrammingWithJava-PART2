
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    @Override
    public void run() {
        
        this.calculator = new Calculator();
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(500, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField outputField = new JTextField("0");
        JTextField inputField = new JTextField();
        
        outputField.setEnabled(false);
        container.add(outputField);
        container.add(inputField);
        container.add(createJPanel(inputField, outputField));
    }
    
    private JPanel createJPanel(JTextField input, JTextField output) {
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zet = new JButton("Z");
        
        panel.add(plus);
        panel.add(minus);
        panel.add(zet);
        
        ClickListener click = new ClickListener(calculator, input, output, minus, plus, zet);
        
        
        plus.addActionListener(click);
        minus.addActionListener(click);
        zet.addActionListener(click);
        
        zet.setEnabled(false);
        
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
