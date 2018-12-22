/**
 * 
 */
package people;

/**
 * A person is boy type class.
 * @author dracon
 * @version 1.0
 * @since 2018-12-21
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
		
		//static binding
		obj.walk();
		obj2.walk();
		
		//dynamic binding
		obj.talk();
		obj2.talk();
	}

}
