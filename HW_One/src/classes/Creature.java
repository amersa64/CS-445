package classes;

public abstract class Creature extends Thing {
	private Thing inStomach = null;
	public Creature(String name) {
		super(name);
	}
	public void eat(Thing aThing){
		inStomach = aThing;
		System.out.println(this.toString()+ " has just eaten "+ aThing.toString());
	}
	public abstract void move();
	public void whatDidYouEat(){
		if(inStomach == null){
			System.out.println(this.toString()+" has had nothing to eat!");
		}else{
			System.out.println(this.toString()+" has eaten a "+ inStomach.toString());
		}
	}

	

}
