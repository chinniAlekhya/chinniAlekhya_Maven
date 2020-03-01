package newyeargift.com.gifts;

public class Kalakand extends Sweets implements Gifts {
	String name;
	int cost,quantity;
	Kalakand(String name,int cost ,int quantity){
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
