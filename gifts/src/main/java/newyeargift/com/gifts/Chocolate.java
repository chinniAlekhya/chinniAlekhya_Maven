 package newyeargift.com.gifts;

public abstract class Chocolate {
     String name;
     int cost;
     int quantity;
     Chocolate(String name,int cost,int quantity){
    	 this.name = name;
    	 this.cost = cost;
    	 this.quantity = quantity;
     }
     abstract public String getName();
     abstract public int getCost();
     abstract public int getQuantity();
}
