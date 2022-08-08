package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AddressBookOperations {
	ArrayList<Contacts> list = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	void addContact(){
		Contacts contact = new Contacts();
		System.out.print("Enter first name: ");
		contact.setFirstName(sc.next());
		System.out.print("Enter last name:");
		contact.setLastName(sc.next());
		System.out.print("Enter city: ");
		contact.setCity(sc.next());
		System.out.print("Enter state: ");
		contact.setState(sc.next());
		System.out.print("Enter address:  ");
		sc.nextLine();
		contact.setAddress(sc.nextLine());
		System.out.print("Enter Zipcode: ");
		contact.setZip(sc.next());
		System.out.print("Enter phone Number: ");
		contact.setPhoneNumber(sc.next());
		System.out.print("Enter email address: ");
		contact.setEmail(sc.next());
		list.add(contact);
	}

	void displayContacts(){
		Iterator<Contacts> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}

}