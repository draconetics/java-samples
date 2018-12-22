/**
 * 
 */
package people;

/**
 * @author dracon
 *
 */
public class Boy extends Human{
	
	public static void walk() {
		System.out.println("Boy Walks.");
	}
	
	public void talk() {
		System.out.println("Boy talk.");
	}
	
	public static void main(String[] args) {
		Human obj = new Boy();
		Human obj2 = new Human();
		
		obj.walk();
		obj2.walk();
		
		//probing talk method.
		obj.talk();
		obj2.talk();
	}

}
