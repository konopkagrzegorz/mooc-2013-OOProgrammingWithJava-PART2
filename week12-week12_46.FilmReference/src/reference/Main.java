package reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Main {

    public static void main(String[] args) {
        // Test your code here
        
        /*RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.GOOD);
        ratings.addRating(pekka, eraserhead, Rating.GOOD);

        System.out.println("Ratings for Eraserhead: " + ratings.getRatings(eraserhead));
        System.out.println("Matti's ratings: " + ratings.getPersonalRatings(matti));
        System.out.println("Reviewers: " + ratings.reviewers());*/
        
        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");
        Person thomas = new Person("Thomas");

        Map<Person, Integer> peopleIdentities = new HashMap<Person, Integer>();
        peopleIdentities.put(matti, 42);
        peopleIdentities.put(pekka, 134);
        peopleIdentities.put(mikke, 8);
        peopleIdentities.put(thomas, 82);

        List<Person> ppl = Arrays.asList(matti, pekka, mikke, thomas);
        System.out.println("People before sorting: " + ppl);

        Collections.sort(ppl, new PersonComparator(peopleIdentities));
        System.out.println("People after sorting: " + ppl);
    }
}
