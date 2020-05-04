
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class PromissoryNote {
    
    private HashMap<String, Double> loanAmount;

    public PromissoryNote() {
        this.loanAmount = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        loanAmount.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if (this.loanAmount.containsKey(whose)) {
            return this.loanAmount.get(whose);
        }
        return 0;
    }
    
}
