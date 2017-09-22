<<<<<<< HEAD
/**
 * 
 */
package classes;

/**
 * @author Amer
 *
 */
public class Fly extends Creature implements Flyer{

	/**
	 * 
	 */
	public Fly(String name) {
		super(name);
	}
	@Override
	public void eat(Thing aThing){
		if(aThing instanceof Creature)
			System.out.println(toString() + " won't eat a " + aThing.toString());
		else
			super.eat(aThing);
	}
	public void fly(){
		System.out.println(this+ " is buzzing around in flight.");
	}
	@Override
	public void move() {
		fly();
	}

}
=======
/**
 * 
 */
package classes;

/**
 * @author Amer
 *
 */
public class Fly extends Creature implements Flyer{

	/**
	 * 
	 */
	public Fly(String name) {
		super(name);
	}
	@Override
	public void eat(Thing aThing){
		if(aThing instanceof Creature)
			System.out.println(toString() + " won't eat a " + aThing.toString());
		else
			super.eat(aThing);
	}
	public void fly(){
		System.out.println(this+ " is buzzing around in flight.");
	}
	@Override
	public void move() {
		fly();
	}

}
>>>>>>> 106c5fc76958eab0146d216665c3bf52611de956
