package Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book System :");
		System.out.println("-------------------------------");
		AddressBookOperations add = new AddressBookOperations();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        do {
        System.out.println("Enter Your Choice :\n1) Add Contact"		
        							+ "\n2) Display Contactt"
        							+ "\n3) Exit");
        int option = sc.nextInt();
            switch (option) {
                case 1:
                    add.addContact();
                    break;    
                case 2:
                    add.displayContacts();
                    break;
                case 3:
                    exit = false;
                default:
                    break;
            }
        }while(exit);
    }
}