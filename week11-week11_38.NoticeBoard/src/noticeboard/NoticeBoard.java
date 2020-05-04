package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField firstRow = new JTextField("I was copied here from JTextArea.");
        JButton copyButton = new JButton("Copy!");
        JLabel lastRow = new JLabel();
        
        AreaCopier areaCopier = new AreaCopier(firstRow, lastRow);
        copyButton.addActionListener(areaCopier);
        container.add(firstRow);
        container.add(copyButton);
        container.add(lastRow);
    }
    
    
    
    public JFrame getFrame() {
        return frame;
    }
}
