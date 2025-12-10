
public class AddressBook {

        private Contacts contact;
        public void addContact(Contacts contact) {
            this.contact = contact;
            System.out.println("Contact added to Address Book");
        }

        public void displayContact() {
            System.out.println("Contact Details:");
            System.out.println(
                    contact.getFirstName() + " " +
                            contact.getLastName() + ", " +
                            contact.getCity() + ", " +
                            contact.getPhoneNumber()
            );
        }
    }








