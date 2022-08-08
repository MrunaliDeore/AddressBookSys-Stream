package Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.sql.rowset.Predicate;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system");
        System.out.println("-------------------------------");       
      
       //create array list
        List<Contacts> newContact = new ArrayList<Contacts>();
      
        newContact.add(new Contacts("mrunali","Deore","GRoad","Nashik","Mharashtra",123,919874561,"mru@gmail.com"));
        newContact.add(new Contacts("Ankita","Patil","ABV","Pune","Mharashtra",789,919874565,"anki@gmail.com"));
        newContact.add(new Contacts("Neha","Jadhav","DFHHJ","Mumbai","Mharashtra",8888,919874561,"neha@gmail.com"));

        //by using foreach print all list separately
        newContact.forEach(str->System.out.println(str));
    }
}