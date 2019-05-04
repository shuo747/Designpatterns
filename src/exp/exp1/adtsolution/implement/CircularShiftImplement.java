package exp.exp1.adtsolution.implement;

import java.util.List;

import exp.exp1.adtsolution.Characters;
import exp.exp1.adtsolution.CircularShift;
import exp.exp1.adtsolution.LineStorage;

public class CircularShiftImplement implements CircularShift {
	private LineStorage lineStorage = new LineStorageImplement();
	private static final String noiseWords = "a an and ";

	public CircularShiftImplement() {
	}

	public CircularShiftImplement(LineStorage lineStorage) {
		this.lineStorage = lineStorage;
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

	public void setup(Characters characters) {
		int size = characters.getLineCount();
		for (int i = 0; i < size; i++) {
			String[] line = characters.getLine(i);
			for (int j = 0; j < line.length; j++) {
				if (noiseWords.indexOf((line[j] + " ").toLowerCase()) != -1)
					continue;
				String[] newLine = new String[line.length];
				int k = 0;
				for (k = j; k < line.length; k++) {
					newLine[k - j] = line[k];
				}

				for (k = 0; k < j; k++) {
					newLine[k + line.length - j] = line[k];
				}

				addLine(newLine);
			}
		}
	}

	public int getLineCount() {
		return lineStorage.getLineCount();
	}

	public List<String[]> getAllLines() {
		return lineStorage.getAllLines();
	}

}
