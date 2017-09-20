package problem5;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImprovedStringTokenizerTest {
	

	@Test
	public void testImprovedStringTokenizer() {
		String txt = "StringTokenizer is part of the Java API";
		ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer(txt);
		String[] atxt ={"StringTokenizer", "is","part","of","the","Java","API"};
		assertArrayEquals(atxt, tokenizer.Tokenize());
	}

	@Test
	public void testNextToken() {
		String txt = "StringTokenizer is part of the Java API";
		ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer(txt);
		assertEquals(tokenizer.nextToken(),"StringTokenizer");
		assertEquals(tokenizer.nextToken(),"is");
		assertEquals(tokenizer.nextToken(),"part");
		assertEquals(tokenizer.nextToken(),"of");
		assertEquals(tokenizer.nextToken(),"the");
		assertEquals(tokenizer.nextToken(),"Java");
		assertEquals(tokenizer.nextToken(),"API");
		assertEquals(tokenizer.nextToken(),null);
	}

	@Test
	public void testHasMoreTokens() {
		String txt = "StringTokenizer is part of the Java API";
		ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer(txt);
		int numtok = 0;
		while(numtok<6){
			assertTrue(tokenizer.hasMoreTokens());
			tokenizer.nextToken();
			numtok++;
		}
		assertFalse(tokenizer.hasMoreTokens());
		assertFalse(tokenizer.hasMoreTokens());

	}

	@Test
	public void testCountTokens() {
		String txt = "StringTokenizer is part of the Java API";
		ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer(txt);
		assertEquals(tokenizer.countTokens(),7);
	}

}
