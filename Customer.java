package CaseStudy;
import java.util.*;

public class Customer {
	private String username;
	private String password;
	ArrayList<String> users_a= new ArrayList<String>();
	ArrayList<String> password_a= new ArrayList<String>();
	ArrayList<ArrayList<String>> userdata = new ArrayList();
    Scanner scanner = new Scanner(System.in);
//	String [][] users= {{"Upasana.n","upasana@123"},
//						{"Shaunak.a","shaunak@123"},
//						{"Shaira.a","shaira@123"}
//						};
Customer(){
	users_a.add("Upasana");
	users_a.add("Shaunak");
	users_a.add("Shaira");
	userdata.add(users_a);
	password_a.add("upasana@123");
	password_a.add("shaunak@123");
	password_a.add("shaira@123");
	userdata.add(password_a);
	}
void Getdetails(int choice) {

if (choice == 1) {
    System.out.print("Enter your username: ");
    String username = scanner.nextLine();
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();
   SignUpCustomer(username,password);
   }

else if(choice == 2) {
System.out.print("Enter your username: ");
String username = scanner.nextLine();
System.out.print("Enter your password: ");
String password = scanner.nextLine();
LoginCustomer(username,password);
}
}
void SignUpCustomer(String name, String password) {
	users_a.add(name);
	password_a.add(password);
	System.out.println("Thank you for signing up :)");
}
	
void LoginCustomer(String name, String password) {
	for(int i =0; i< users_a.size();i++) {
		if(name.equals(users_a.get(i))&& password.equals(password_a.get(i))) {
			System.out.println("You are successfully loggedin :)");
			return;	
		}
	}
	System.out.println("Invalid Credentials");	

}
	
}
	
	


