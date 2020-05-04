/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Grzegorz Konopka
 */
public class Person {
    
    private String name;
    private Education educationType;

    public Person(String name, Education educationType) {
        this.name = name;
        this.educationType = educationType;
    }

    public String getName() {
        return name;
    }

    public Education getEducation() {
        return educationType;
    }

    @Override
    public String toString() {
        return name + ", " + educationType;
    }
}
