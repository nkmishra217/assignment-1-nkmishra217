package contactDisplay;

import java.util.Scanner;
public class contact {
    Node head;

    public void add(String f_name, String l_name, long phone, String email) {
        Scanner sc = new Scanner(System.in);
        Node node = new Node(f_name, l_name, phone, email);
        // checking head is null or not
        System.out.println("You have chosen to add a new contact");
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name:");
        String s1 = sc.nextLine();
        System.out.println("Last Name");
        String s2 = sc.nextLine();
        System.out.println("Contact number:");
        long l = sc.nextLong();


    }


}
