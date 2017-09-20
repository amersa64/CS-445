/**
 * 
 */
package classes;
/**
 * @author Amer
 *
 */
public class TestCreature {

	/**
	 * @param args
	 */
	public static final int THING_COUNT = 10;
	public static final int CREATURE_COUNT = 6;
	
	public static void main(String[] args) {
		Thing[] things = new Thing[THING_COUNT];
		Creature[] creatures = new Creature[CREATURE_COUNT];
		things[0] = new Thing("Banana");
		things[1] = new Thing("Tigger, Pooh's Friend");
		things[2] = new Thing("Locomotive");
		things[3] = new Thing("Tick-Tock the Crocodile");
		creatures[0] = new Tiger("Tigger, Pooh's Friend");
		creatures[1] = new Ant("Aunty");
		creatures[2] = new Bat("Batty");
		creatures[3] = new Fly("Flying");
		things [4] = creatures[0];
		things [5] = creatures[1];
		things [6] = creatures[2];
		things [7] = creatures[3];
		System.out.println("Things: \n");
		for(Thing x: things){
			if(x != null)
				System.out.println(x);
		}
		System.out.println();
		System.out.println("Creatures: \n");
		for(Creature one: creatures){
			if(one != null){
				System.out.println("Testing for Move of "+ one);
				one.move();
			}
		}
		System.out.println();
		//test for tiger eat
		for(int x= 0; x<4;x++){
			System.out.println("Testing eat for " + creatures[x]);
			for (int i = 3; i<8; i++){
				creatures[x].eat(things[i]);
				creatures[x].whatDidYouEat();
			}
			System.out.println();
		}
		
		
	}

}
