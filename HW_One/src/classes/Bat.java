package classes;

public class Bat extends Creature implements Flyer {

	public Bat(String name) {
		super(name);
	}
	@Override
	public void eat(Thing aThing){
		if (aThing instanceof Creature)
			super.eat(aThing);
		else if(aThing instanceof Thing)
			System.out.println(this + " won't eat a "+ aThing.toString());
	}
	@Override
	public void fly() {
		System.out.println(this.toString()+ " is swooping through the dark.");
	}

	@Override
	public void move() {
		fly();
	}

}
