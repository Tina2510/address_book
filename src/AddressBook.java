public class AddressBook {

    private Contacts contact;
    public void addContact(Contacts contact) {
        this.contact = contact;
        System.out.println("✔ Contact added to Address Book");
    }
    public void displayContact() {
        if (contact != null) {
            System.out.println("\n--- Contact Details ---");
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("City: " + contact.getCity());
            System.out.println("State: " + contact.getState());

            System.out.println("Zip: " + contact.getZip());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
        } else {
            System.out.println("No contact available.");
        }
    }
}
