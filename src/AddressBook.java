import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contacts> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contacts contact) {
        contacts.add(contact);
        System.out.println("✔ Contact added successfully!");
    }


    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("\n--- All Contacts ---");
        for (Contacts contact : contacts) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("-----------------------");
        }
    }

    public List<Contacts> getContacts() {
        return contacts;
    }
}
