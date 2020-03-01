package newyeargift.com.gifts;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Gifts> gift = new ArrayList<Gifts>();
    	gift.add(new Laddu("Laddu",15,10));
        gift.add(new Kalakand("Kalakand",40,10));
        gift.add(new Jilebi("Jilebi",20,5));
        gift.add(new Munch("Munch",10,10));
        gift.add(new Silk("Silk",60,20));
        gift.add(new Kitkat("Kitkat",10,5));
        gift.add(new Kalakand("Kalakand",20,5));
        gift.add(new Laddu("Laddu",10,5));
        gift.add(new Jilebi("Jilebi",20,2));
        gift.add(new Kalakand("Kalakand",10,2));
        gift.add(new Kalakand("Kalakand",40,10));
        gift.add(new Munch("Munch",10,5));
        gift.add(new Kitkat("Kitkat",30,10));
        ArrayList<Sweets> sweet = new ArrayList<Sweets>();
        for(int i =0;i<gift.size();i++){
       	 if(gift.get(i) instanceof Sweets) {
       		 sweet.add((Sweets)gift.get(i));
       	 }
        }
        Collections.sort(sweet,new Comparator<Sweets>() {
        	public int compare(Sweets a,Sweets b) {
        		return a.quantity-b.quantity;
        	}
        });
        ArrayList<Chocolate> choco = new ArrayList<Chocolate>();
        for(int i = 0;i<gift.size();i++) {
           if(gift.get(i) instanceof Chocolate) {
        	   choco.add((Chocolate)gift.get(i));
           }
        }
        Collections.sort(choco,new Comparator<Chocolate>() {
        	public int compare(Chocolate a,Chocolate b) {
        		return a.quantity-b.quantity;
        	}
        });
        for(int i = 0;i<sweet.size();i++) {
        	Sweets s = sweet.get(i);
        	if(s.cost < 50) {
        		System.out.println("Sweet "+s.name+" cost is less than 50 rupees and the cost is "+s.cost+" with quantity "+s.quantity);
        	}
        	else {
        		System.out.println("Sweet "+s.name+" cost is greater than 50 rupees and the cost is "+s.cost+" with quantity "+s.quantity);
        	}
        }
        for(int i = 0;i<choco.size();i++) {
        	Chocolate c = choco.get(i);
        	if(c.cost < 50) {
        		System.out.println("Chocolate "+c.name+" cost is less than 50 rupees and the cost is "+c.cost+" with quantity "+c.quantity);
        	}
        	else {
        		System.out.println("Chocolate "+c.name+" cost is greater than 50 rupees and the cost is "+c.cost+" with quantity "+c.quantity);
        	}
        }
        
        
        
    }
}
 