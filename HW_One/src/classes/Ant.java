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
