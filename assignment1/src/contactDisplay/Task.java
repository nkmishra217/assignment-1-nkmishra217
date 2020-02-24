package contactDisplay;

import personContact.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(contact linkedList1) {
        System.out.println("you have chosen to add a new contact: \n" + "please enter the na,e of the person");
        System.out.println("FirstName: ");
        String firstName = sc.nextLine().trim();
        while (true) {
            if (firstName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("please enter correct name");
            }
            firstName = sc.nextLine().trim();
        }
        System.out.println("Last Name:");
        String lastName = sc.nextLine().trim();
        while (true) {
            if (lastName.matches("[A-Za-z]")) {
                break;
            } else {
                System.out.println("please enter correct name");
            }
            lastName = sc.nextLine().trim();
        }
        System.out.println("contact Number");
        while (true) {
            String contact = sc.nextLine().trim();
            if (contact.matches("[0-9]{10}")) {
                linkedList.add(contact);
                break;
            }
        }
        while (true) {
            System.out.println("would you like to add contact number? (y/n):");
            char choice = sc.next().charAt(0);
            if (choice == 'y') {

                System.out.println("contact number:");
                String contactNumber1 = sc.nextLine().trim();
                while (true) {
                    if (contactNumber1.matches("[0-9]{10}")) {
                        linkedList.add(contactNumber1);
                        break;
                    } else {
                        System.out.println("add correct number");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("enter your email address");
        sc.nextLine();
        while (true) {
            String temp = sc.nextLine();
            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")) {
                linkedList1.addLast(new Person(firstName, lastName, linkedList, temp));
                break;
            } else {
                System.out.println("invalid email address ! enter again");
            }
        }
    }

    public void viewcontact(contact linkedList1) {
        System.out.println("------here are all your contacts---");
        if (!linkedList1.isEmpty()) {
            linkedList1.display();
        } else {
            System.out.println("no result found");
        }
    }

    public void deleteContact(contact linkedList1) {
        if (!linkedList1.isEmpty()) {
            System.out.println("here are all the contact: press the number against" + "to delete the contact");
            linkedList1.displayOne();
            System.out.println("Deleted..!!");
            ;
        } else {
            System.out.println("No contacts.You must need to add contacts Before you could delete..");
        }
    }

    public void searchContact(contact linkedList1) {
        System.out.println("you could search for a contact from their first names:");
        String firstName = sc.nextLine().trim();
        if (linkedList.indexOf(firstName) >= 0) {
            System.out.println("Match Found");
            linkedList1.getNode(linkedList1.indexOf(firstName));
        } else {
            System.out.println("No Match Found");
        }
    }
}
