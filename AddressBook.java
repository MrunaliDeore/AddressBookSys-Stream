package Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.*;
import java.util.*;


public class AddressBook {
	private static Collection<Contacts> list;
	private static List<Contacts> slist;

	public static void main(String[] args) {
		System.out.println("Welcome to address book system");
		System.out.println("-------------------------------");       

		//create array list
		List<Contacts> newContact = new ArrayList<Contacts>();
		System.out.println("List of all etries :");
		newContact.add(new Contacts("mrunali","Deore","GRoad","Dhule","Mharashtra",123,919874561,"mru@gmail.com"));
		newContact.add(new Contacts("Ankita","Patil","ABV","Pune","Mharashtra",789,919874565,"anki@gmail.com"));
		newContact.add(new Contacts("Neha","Jadhav","DFHHJ","Mumbai","Mharashtra",8888,919874561,"neha@gmail.com"));
		newContact.add(new Contacts("Neha","Jadhav","DFHHJ","Mumbai","Mharashtra",8888,919874561,"neha@gmail.com"));
		newContact.add(new Contacts("pooja","pawar","DFHHJ","Mumbai","Mharashtra",8888,919874561,"neha@gmail.com"));
		newContact.add(new Contacts("mrunali","Deore","GRoad","Nashik","Mharashtra",123,919874561,"mru@gmail.com"));

		//by using for each print all list separately
		newContact.forEach(str->System.out.println(str));

		//by using distinct no duplicate entry will print
		System.out.println("\nBy using distinct - without dublicates entries : ");
		List<Contacts> uniquelist = newContact.stream().distinct().collect(Collectors.toList());
		uniquelist.forEach(System.out::println);

		//search city
		System.out.println("\nsearch by city");
		newContact.stream()  
		.filter(city->"Mumbai".equals(city.getCity()))   // filtering city  
		.map(pm ->pm.city)          // fetching city  
		.forEach(System.out::println);  // iterating city 

		//search by city by view person details
		System.out.println("\nBy using city name search person details : ");
		Contacts person = newContact.stream()
				.filter(city->"Pune".equals(city.getCity()))
				.findAny()
				.orElse(null);
		System.out.println(person);
		
		//get count by city
		System.out.println("\nGet count of number of person by city : ");
		long count = newContact
				  .stream()
				  .filter(c -> c.getCity().startsWith("Mumbai"))
				  .count();
		System.out.println(count);
		
		//sort by name
		System.out.println("\nSort albhabatically by name : ");
		slist = newContact.stream().sorted(Comparator.comparing(Contacts::getFirstName)).collect(Collectors.toList());
		slist.forEach(System.out::println);
	}
}



