import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Contacts contact = new Contacts();


        System.out.print("Enter First Name: ");
        contact.setFirstName(sc.nextLine());

        System.out.print("Enter Last Name: ");
        contact.setLastName(sc.nextLine());

        System.out.print("Enter Address: ");
        contact.setAddress(sc.nextLine());

        System.out.print("Enter City: ");
        contact.setCity(sc.nextLine());

        System.out.print("Enter State: ");
        contact.setState(sc.nextLine());

        System.out.print("Enter Zip: ");
        contact.setZip(sc.nextLine());

        System.out.print("Enter Phone Number: ");
        contact.setPhoneNumber(sc.nextLine());

        System.out.print("Enter Email: ");
        contact.setEmail(sc.nextLine());


        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact);


        addressBook.displayContact();
    }
}

