<<<<<<< HEAD
package classes;

public class Ant  extends Creature{

	public Ant(String name){
		super(name);
	}

	@Override
	public void move() {
		String className = getClass().getSimpleName();
		System.out.println(getName()+" "+ className + " is crawling around.");
	}

}
=======
package classes;

public class Ant  extends Creature{

	public Ant(String name){
		super(name);
	}

	@Override
	public void move() {
		String className = getClass().getSimpleName();
		System.out.println(getName()+" "+ className + " is crawling around.");
	}

}
>>>>>>> 106c5fc76958eab0146d216665c3bf52611de956
