/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Grzegorz Konopka
 */
public class RatingRegister {
    
    private Map<Person, Map<Film, Rating>> personalRatings;
    private Map<Film, List<Rating>> filmRatings;

    public RatingRegister() {
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
        this.filmRatings = new HashMap<Film, List<Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if (!filmRatings.containsKey(film)) {
            filmRatings.put(film, new ArrayList<Rating>());
        }
        filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating) {
         if (!personalRatings.containsKey(person)) {
            personalRatings.put(person, new HashMap<Film, Rating>());
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        } else if (!personalRatings.get(person).containsKey(film)) {
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public List<Rating> getRatings(Film film) {
        if (filmRatings.containsKey(film)) {
            return filmRatings.get(film);
        }
        return null;
    }
    
    public Rating getRating(Person person, Film film) {
        if (!personalRatings.containsKey(person)) {
            return Rating.NOT_WATCHED;
        } else if (!personalRatings.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        } 
        return personalRatings.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalRatings.containsKey(person)) {
            return personalRatings.get(person);
        }
        return null;
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }
    
    public List<Person> reviewers() {
        return new ArrayList<Person>(personalRatings.keySet());
    }
}
