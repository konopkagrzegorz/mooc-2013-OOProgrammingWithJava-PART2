
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    private static List<Contact> list = new ArrayList<Contact>();
    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        
        /*Contact contact1 = new Contact("Mokka");
        Contact contact2 = new Contact("Bokka");
        Contact contact3 = new Contact("Mokka");
        Contact contact4 = new Contact("Grzegorz");
        contact1.addNumber("1111");
        contact1.addNumber("2222");
        contact2.addNumber("1111");
        
        
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        phonebook.addContact(contact4);
        
        for (Contact contact : phonebook.getContacts()) {
        System.out.println(contact.getContactName() + contact.getContactNumbers());
        }
        
        for (Contact contact : phonebook.getContacts()) {
            if (contact.getContactName().contains("Mokka")) {
        contact.printNumbers();
            }
        }
        
        for (Contact contact : phonebook.getContacts()) {
            if (contact.getContactNumbers().contains("11")) {
                System.out.println(contact.getContactName());
            }
        }*/
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
    
    public static void addContact(Contact contact) {
        if (!list.contains(contact))
        list.add(contact);
    }
}
