package exp.exp1.adtsolution.implement;

import exp.exp1.adtsolution.Characters;
import exp.exp1.adtsolution.LineStorage;

public class CharactersImplement implements Characters {
	
	private LineStorage lineStorage = new LineStorageImplement();
	
	
	public CharactersImplement(LineStorage lineStorage) {
		this.lineStorage = lineStorage;
	}
	
	public CharactersImplement() {
		// TODO Auto-generated constructor stub
	}

	public LineStorage getLineStorage() {
		return lineStorage;
	}

	public void setLineStorage(LineStorage lineStorage) {
		this.lineStorage = lineStorage;
	}

	
	public void addLine(String[] line) {
		lineStorage.addLine(line);
	}

	
	public void deleteLine(int lineIndex) {
		lineStorage.deleteLine(lineIndex);
	}

	public String[] getLine(int lineIndex) {
		return lineStorage.getLine(lineIndex);
	}

	public String getLineAsString(int lineIndex) {
		return lineStorage.getLineAsString(lineIndex);
	}

	
	public int getLineCount() {
		return lineStorage.getLineCount();
	}

	
	public void insertLine(int lineIndex, String[] line) {
		lineStorage.insertLine(lineIndex, line);
	}

	
	public void setLine(int lineIndex, String[] line) {
		lineStorage.setLine(lineIndex, line);
	}

	public void addLine(String line) {
		lineStorage.addLine(line);
	}

}
