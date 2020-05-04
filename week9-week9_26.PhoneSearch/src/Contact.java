
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Contact implements Comparable<Contact>{
    
    private String contactName;
    private Set<String> contactNumbers;
    private Set<String> contactAdress;

    public Contact() {
    }

    public Contact(String contactName) {
        this.contactName = contactName;
        this.contactNumbers = new HashSet<String>();
        this.contactAdress = new HashSet<String>();
    }

    public String getContactName() {
        return contactName;
    }

    public Set<String> getContactNumbers() {
        return contactNumbers;
    }

    public Set<String> getContactAdress() {
        return contactAdress;
    }
    
    public void addAddress(String street, String city) {
        String address = street + " " + city;
        this.contactAdress.add(address);
    }
    
    public void addNumber(String number) {
        if (number.matches("^[a-zA-Z]*$")) {
            System.out.println("Numbers does not have letters. Did not add!");
        } else if (number == null) {
            System.out.println("You can not add empty number!");
        } else {
            this.contactNumbers.add(number);
        }
    }
    
    public void printNumbers() {
        if (contactNumbers.isEmpty()) {
            System.out.println("   phone number not found");
        } else {
            System.out.println("  phone numbers:");
        }
        for (String number : this.contactNumbers) {
            System.out.println("   " + number);
            }
    }
    
    private void printAdress() {
        if (this.contactAdress.isEmpty()) {
            System.out.println("  address unknown");
        } else {
            for (String address : this.contactAdress) {
                System.out.println("address: " + address);
            }
        }
    }
    
    public void printAllInformations() {
        printAdress();
        printNumbers();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.contactName.hashCode();
        hash = 31 * hash + this.contactNumbers.hashCode();
        hash = 31 * hash + this.contactAdress.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            if (getContactName().contains(obj.toString())) {
                return true;
            }
        }
        Contact other = (Contact) obj;
        if (this.getContactName().contains(other.getContactName())) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Contact object) {
        int s = this.getContactName().compareTo(object.getContactName());
        return s;
    }
    
    
}
