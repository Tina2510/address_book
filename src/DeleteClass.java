import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class DeleteClass {


    public static void deleteContact(List<Contacts> contacts, Scanner sc) {
        System.out.print("Enter First Name of contact to delete: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name of contact to delete: ");
        String lastName = sc.nextLine();

        boolean found = false;

        Iterator<Contacts> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contacts contact = iterator.next();
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {

                iterator.remove();
                System.out.println("Contact deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}
