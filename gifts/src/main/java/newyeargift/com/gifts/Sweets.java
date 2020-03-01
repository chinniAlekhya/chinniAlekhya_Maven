package newyeargift.com.gifts;

public abstract class Sweets {
   int cost,quantity;
   String name;
   Sweets(String name,int cost,int quantity){
	   this.name = name;
	   this.cost = cost;
	   this.quantity = quantity;
   }
   abstract String getName();
   abstract int getCost();
   abstract int getQuantity();
}
