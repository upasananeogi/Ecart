package CaseStudy;
import java.util.*;

public class Ecart {

	public static void main(String[] args) {
		int id;
		Customer c= new Customer(); 
		Cart ct = new Cart();
		Order o= new Order();
     	Scanner scanner = new Scanner(System.in);
		System.out.println("E-Cart Application");
        System.out.println("1. Sign Up");
        System.out.println("2. Login In");
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();
        c.Getdetails(choice);
        System.out.println("");
        System.out.println("Choose Product: ");
        System.out.println("");
        System.out.println("Product Price Type ");
        ct.getDisplay();
        System.out.println("");
        o.choosemenu();
        o.getbill(o.order);
        System.out.println("Total price: "+o.getbill(o.order));
        System.out.println("Enter Id number:");
        id=scanner.nextInt();
        
        
        
        
        
        
}}