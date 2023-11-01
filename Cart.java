package CaseStudy;
public class Cart {

	public class Cart_Item{

	String name;
	int price;
	String description;
	public Cart_Item(String name,int price,String description){ 
		this.name= name;
		this.price=price;
		this.description=description;
		
		}
	}

	Cart_Item menu[]= new Cart_Item[3];
	
	public Cart() {
		Cart_Item cart0 = new Cart_Item("TV     ",5000," Electronics");
		Cart_Item cart1 = new Cart_Item("Fridge ",4000," Electronics");
		Cart_Item cart2 = new Cart_Item("Mobile ",5000," Electronics");
		Cart_Item cart3 = new Cart_Item("Bowl   ",50,"   Home");
		Cart_Item cart4 = new Cart_Item("CookSet",1000," Home");
		Cart_Item cart5 = new Cart_Item("Table  ",1000," Home");
	    menu= new Cart_Item[]{cart0,cart1,cart2,cart3,cart4,cart5};
	}

	public void getDisplay() {
		for(int i=0;i<menu.length ;i++) {
			System.out.println(menu[i].name+" "+ menu[i].price+" "+ menu[i].description);
			}
	}


}
