package newyeargift.com.gifts;

public class Kitkat extends Chocolate implements Gifts {
	String name;
	int cost,quantity;
    Kitkat(String name,int cost ,int quantity){
		super(name,cost,quantity);
	}
	public String getName() {
		return this.name;
	}
	public int getCost() {
		return this.cost;
	}
	public int getQuantity() {
		return this.quantity;
	}
}
