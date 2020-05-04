
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();    
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (Card obj : cards) {
            System.out.println(obj);
        }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hh){
        int sum1 = 0;
        for (Card card : hh.cards){
            sum1 += card.getValue();
        }
        
        int sum2 = 0;
        for (Card card : this.cards){
            sum2 += card.getValue();
        }
        
        return sum2 - sum1;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
         Collections.sort(this.cards, suitSorter);
    }
}
