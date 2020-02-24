package contactDisplay;

import java.util.Scanner;

public class FinalContacts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contact linkedList1 = new contact();
        Task task = new Task();
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("press 5 to exit program");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            task.addContact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 2) {
            task.viewcontact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 3) {
            task.searchContact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 4) {
            task.deleteContact(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if (choice == 5) {
            System.out.println("App terminate");
        }

    }
}


