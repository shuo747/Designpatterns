package exp.exp1.impinvosolution;

class Pair {
	private int lineIndex;
	private int wordIndex;
	
	public Pair(int line, int word) {
		this.lineIndex = line;
		this.wordIndex = word;
	}

	public int getLineIndex() {
		return lineIndex;
	}

	public int getWordIndex() {
		return wordIndex;
	}
}