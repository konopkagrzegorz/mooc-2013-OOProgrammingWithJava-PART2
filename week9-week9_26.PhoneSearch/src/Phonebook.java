
import java.util.ArrayList;
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
public class Phonebook {
    
    private List<Contact> contacts;

    public Phonebook() {
       this.contacts = new ArrayList<Contact>();
    }
    
    public void addContact(Contact contact) {
        if (!this.contacts.contains(contact))
        this.contacts.add(contact);
    }
    
    public void addAdress(Contact contact, String street, String city) {
        if (this.contacts.contains(contact)) {
            int i = this.contacts.indexOf(contact);
            this.contacts.get(i).addAddress(street, city);
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    
    public boolean numberAlreadyInDatabase(String number) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactNumbers().contains(number)) {
                return true;
            }
        }
        return false;
    }  
}
