
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class ClickListener implements ActionListener {
    
    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton minus;
    private JButton plus;
    private JButton zet;

    public ClickListener(Calculator calculator, JTextField input, JTextField output, JButton minus, JButton plus, JButton zet) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.minus = minus;
        this.plus = plus;
        this.zet = zet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            pressPlus();
        } else if (e.getSource() == minus) {
            pressMinus();
        } else if (e.getSource() == zet) {
            pressZet();
        }
    }
    
    public void setOutput() {
        output.setText("" + calculator.getValue());
        zet.setEnabled(true);
    }
    
    private void pressPlus() {
        try {
            calculator.pressPlus(Integer.parseInt(input.getText()));
            setOutput();
        }catch (NumberFormatException e){
        }
        input.setText("");
    }
    
    private void pressMinus(){
        try {
            calculator.pressMinus(Integer.parseInt(input.getText()));
            setOutput();
        }catch (NumberFormatException e){
        }
        input.setText("");
    }
    
    private void pressZet(){
        calculator.pressZet();
        output.setText("0");
        input.setText("");
        zet.setEnabled(false);
    }
    
    
    
    
    
}
