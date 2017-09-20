package problem4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImporvedRandomTest {

	@Test
	public void test() {
		ImporvedRandom r = new ImporvedRandom();
		
		int x = r.nextInt(5,13);
		int c = 0 ;
		while(c <1200){
			x = r.nextInt(5,13);
			c++;
			assertTrue(x>=5 && x <=13);
		}
	}

}
