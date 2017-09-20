package problem5;

public class ImprovedStringTokenizer {
	String currentText;
	int currentWordIndex;
	String[] words;
	public ImprovedStringTokenizer(String txt) {
		this.currentText= txt;
		this.currentWordIndex = 0;
		Tokenize();
	}
	public String[] Tokenize(){
		this.words = currentText.split(" ");
		return this.words;
	}
	public String nextToken(){
		if(currentWordIndex>=words.length){
			return null;
		}
		return words[currentWordIndex++];
	}
	public boolean hasMoreTokens(){
		return (currentWordIndex<words.length-1);
	}
	public int countTokens(){
		return words.length-currentWordIndex;
	}
	
	

}
