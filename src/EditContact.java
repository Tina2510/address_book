import java.util.List;
import java.util.Scanner;

public class EditContact {


    public static void editContact(List<Contacts> contacts, Scanner sc) {
        System.out.print("Enter First Name of contact to edit: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name of contact to edit: ");
        String lastName = sc.nextLine();

        boolean found = false;

        for (Contacts contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {

                System.out.println("Editing contact: " + firstName + " " + lastName);

                System.out.print("Enter new First Name: ");
                contact.setFirstName(sc.nextLine());

                System.out.print("Enter new Last Name: ");
                contact.setLastName(sc.nextLine());

                System.out.print("Enter new Address: ");
                contact.setAddress(sc.nextLine());

                System.out.print("Enter new City: ");
                contact.setCity(sc.nextLine());

                System.out.print("Enter new State: ");
                contact.setState(sc.nextLine());

                System.out.print("Enter new Zip: ");
                contact.setZip(sc.nextLine());

                System.out.print("Enter new Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());

                System.out.print("Enter new Email: ");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}

