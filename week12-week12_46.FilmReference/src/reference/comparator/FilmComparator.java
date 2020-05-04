/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Grzegorz Konopka
 */
public class FilmComparator implements Comparator<Film> {
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    @Override
    public int compare(Film o1, Film o2) {
       double averageRatingO1 = 0;
       double averageRatingO2 = 0;
       
       for (Rating rating : ratings.get(o1)) {
           averageRatingO1 += rating.getValue();
       }
       
       averageRatingO1 = averageRatingO1/ratings.get(o1).size();
       averageRatingO1 = (int) averageRatingO1;
       
       for (Rating rating : ratings.get(o2)) {
           averageRatingO2 += rating.getValue();
       }
       
       averageRatingO2 = averageRatingO2/ratings.get(o2).size();
       averageRatingO2 = (int) averageRatingO2;
       
       if (averageRatingO1 == averageRatingO2) {
           return 0;
       } else if (averageRatingO1 < averageRatingO2) {
           return 1;
       }
       return -1;
    }
}
