
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class UserInterface {
    
    private Phonebook phonebook;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.phonebook = new Phonebook();
        this.scanner = scanner;
    }
    
    public void printMenu() {
        System.out.println("phone search\n" +
                           "available operations:\n" +
                           " 1 add a number\n" +
                           " 2 search for a number\n" +
                           " 3 search for a person by phone number\n" +
                           " 4 add an address\n" +
                           " 5 search for personal information\n" +
                           " 6 delete personal information\n" +
                           " 7 filtered listing\n" +
                           " x quit");
    }
    
    public void start() {
        printMenu();
        boolean run = true;
        while (run) {
            System.out.print("command: ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("1")) { 
                    addContactUI();
            } else if (choice.equals("2")) {
                    searchNumberByNameUI();
            } else if (choice.equals("3")) {
                    searchContactByNumberUI();
            } else if (choice.equals("4")) {
                    addAddressUI();
            } else if (choice.equals("5")) {
                    searchForPersonalInformationUI();
            } else if (choice.equals("6")) {
                    deleteContactInformationUI();
            } else if (choice.equals("7")) {
                    searchByKeywordUI();
            } else if (choice.equals("x")) {
                    run = false;
                    break;
            } else {
                System.out.println("Wrong pick!");
            }
        }
    }
    
    public void addContactUI() {
        boolean statement = false;
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();
        for (Contact contact : phonebook.getContacts()) {
            if (contact.getContactName().equals(name)) {
                contact.addNumber(number);
                statement = true;
            }
        }
        if (statement == false) {
            Contact temp = new Contact(name);
            temp.addNumber(number);
            phonebook.addContact(temp);
        }
        
    }
    
    public void searchNumberByNameUI() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        name.toLowerCase().trim();
        for (Contact person  : phonebook.getContacts()) {
        if(person.getContactName().contains(name)){
            person.printNumbers();
            }
        else {
            System.out.println("  not found");
            break;
            }
        }
    }
    
    public void searchContactByNumberUI() {
        boolean statement = false;
        System.out.print("number: ");
        String number = scanner.nextLine();
            for (int i = 0; i < phonebook.getContacts().size(); i++) {
                if (phonebook.getContacts().get(i).getContactNumbers().contains(number)) {
                    System.out.println(" " + phonebook.getContacts().get(i).getContactName());
                    statement = true;
                    }
                }
                if (statement == false) {
                    System.out.println("  not found");
                }
    }
    
    public void searchForPersonalInformationUI() {
        boolean statement = false;
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        for (int i = 0; i < phonebook.getContacts().size(); i++) {
            if (phonebook.getContacts().get(i).getContactName().contains(name)) {
                phonebook.getContacts().get(i).printAllInformations();
                statement = true;
                }
            }
        if (statement == false) {
            System.out.println(" not found");
            }
    }
    
    public void searchByKeywordUI() {
        boolean statement = false;
        System.out.print("keyword (if empty, all listed): ");
        String search = scanner.nextLine();
        List<Contact> searchedContacts = new ArrayList<Contact>();
            for (int i = 0; i < phonebook.getContacts().size(); i++) {
                for (String temp : phonebook.getContacts().get(i).getContactAdress()) {
                    if (temp.contains(search)) {
                        searchedContacts.add(phonebook.getContacts().get(i));
                        statement = true;
                    }
                }
                if (phonebook.getContacts().get(i).getContactName().contains(search) || phonebook.getContacts().get(i).getContactNumbers().contains(search)) {
                    searchedContacts.add(phonebook.getContacts().get(i));
                    statement = true;
                    }
                }
            if (statement == false) {
            System.out.println(" not found");
            } else if (statement == true) {
                Collections.sort(searchedContacts);
            }
            
            for (Contact contact : searchedContacts) {
                System.out.println(" " + contact.getContactName());
                contact.printAllInformations();
            }
    }
    
    public void deleteContactInformationUI() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
            for (int i = 0; i < phonebook.getContacts().size(); i++) {
                if (phonebook.getContacts().get(i).getContactName().contains(name)) {
                    phonebook.getContacts().remove(i);
                    }
                }
    }
    
    public void addAddressUI() {
        boolean statement = false;
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();
        for (int i = 0; i < phonebook.getContacts().size(); i++) {
            if (phonebook.getContacts().get(i).getContactName().contains(name)) {
                phonebook.getContacts().get(i).addAddress(street, city);
                statement = true;
                }
            }
        if (statement == false) {
            Contact contact = new Contact(name);
            contact.addAddress(street, city);
            phonebook.addContact(contact);
        }
    }
}
