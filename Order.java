package CaseStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	ArrayList<String> order= new ArrayList<String>();
	Cart c = new Cart();
	
	void choosemenu() {
		Scanner s = new Scanner (System.in);
		boolean check= true;
		while(check==true){
			System.out.println("\nPlease enter your prouct:");
			 String item = s.next();
			 System.out.println("\nPlease enter how many:");
			 int m = s.nextInt();
			 int count=m;
			 while(count>0) {
				 order.add(item);
				 count--;
			 }
			 System.out.println("\nPlease enter 1 if you want to order more or press 0:");
			 int n=s.nextInt();
			 if(n!=1)check=false;
			 
			 }
			 }
	int getProduct(String name) {
		for(int i=0;i<c.menu.length;i++) {
			if ((name.trim().equals(c.menu[i].name.trim()))) {
				return(c.menu[i].price);
				
			}
			 
		}
		return -1;
	}
	int getbill(ArrayList<String>list) {
		int bill=0;
		for(int i=0;i<list.size();i++) {
			bill= bill+ getProduct(list.get(i).toString());
		
		}return bill;
		
		
	}
	void display() {
		
	}

}
