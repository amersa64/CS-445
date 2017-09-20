package problem4;
import java.util.Random;
@SuppressWarnings("serial")
public class ImporvedRandom extends Random {

	public ImporvedRandom(long seed){
		super(seed);
	}
	public ImporvedRandom() {
		super();
	}
	public int nextInt(int low, int high){
		return (super.nextInt(high-low+1) + low);
	}
	

}
