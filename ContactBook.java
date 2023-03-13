import java.util.LinkedList;
import java.util.Scanner;

public class ContactBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String[]> contacts = new LinkedList<>();

        while (true) {
            System.out.println("__________________");
            System.out.println("Select an option:");
            System.out.println("__________________");
            System.out.println("A: Add Contact");
            System.out.println("D: Delete Contact");
            System.out.println("P: Print all entries");
            System.out.println("N: Search by Name");
            System.out.println("E: Search by Email");
            System.out.println("Q: Quit");
            System.out.println("__________________");
            String menu = scanner.nextLine();

            switch (menu.toUpperCase()) {
                case "A":
                    System.out.println("Add Contact");
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    String[] contactInfo = {name, phoneNumber, email};
                    contacts.add(contactInfo);
                    break;
                case "D":
                    System.out.println("Delete Contact");
                    System.out.println("Enter name:");
                    String DeleteName = scanner.nextLine();
                    boolean SearchContact = false;
                    for (String[] contact : contacts) {
                        if (contact[0].equals(DeleteName)) {
                            contacts.remove(contact);
                            SearchContact = true;
                            break;
                        }
                    }
                    if (SearchContact) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact does not Exist.");
                    }
                    break;
                case "P":
                    System.out.println("Print all entries");
                    for (String[] contact : contacts) {
                        System.out.println("Name: " + contact[0]);
                        System.out.println("Phone Number: " + contact[1]);
                        System.out.println("Email: " + contact[2]);
                    }
                    break;
                case "E":
                    System.out.println("Search by Email");
                    System.out.println("Enter email:");
                    String emailToSearch = scanner.nextLine();
                    boolean SearchEmail = false;
                    for (String[] contact : contacts) {
                        if (contact[2].equals(emailToSearch)) {
                            System.out.println("Name: " + contact[0]);
                            System.out.println("Phone Number: " + contact[1]);
                            System.out.println("Email: " + contact[2]);
                            SearchEmail = true;
                        }
                    }
                    if (SearchEmail) {
                        System.out.println("No contacts found with the email address " + emailToSearch);
                    }
                    break;
                case "N":
                    System.out.println("Search by Name");
                    System.out.println("Enter Name:");
                    String NameToSearch = scanner.nextLine();
                    boolean SearchName = false;
                    for (String[] contact : contacts) {
                        if (contact[0].equals(NameToSearch)) {
                            System.out.println("Name: " + contact[0]);
                            System.out.println("Phone Number: " + contact[1]);
                            System.out.println("Email: " + contact[2]);
                            SearchName = true;
                        }
                    }
                    if (SearchName) {
                        System.out.println("No contacts found with the email address " + NameToSearch);
                    }
                    break;
                case "Q":
                    System.out.println("Quit");
                    return;
                default:
                    System.out.println("No Exist entry");
                    break;
            }
        }
    }
}
