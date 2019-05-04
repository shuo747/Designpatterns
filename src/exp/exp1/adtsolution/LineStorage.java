package exp.exp1.adtsolution;
import java.util.List;

public interface LineStorage {
	void setWord(int lineIndex, int wordIndex, String word);

	String getWord(int lineIndex, int wordIndex);
	void insertWord(int lineIndex, int wordIndex, String word);
	void addWord(int lineIndex, String word);

	void deleteWord(int lineIndex, int wordIndex);

	void deleteWord(int lineIndex);

	int getWordCount(int lineIndex);

	void setLine(int lineIndex, String[] line);

	void insertLine(int lineIndex, String[] line);

	void addLine(String[] line);

	String[] getLine(int lineIndex);

	String getLineAsString(int lineIndex);

	void deleteLine(int lineIndex);

	int getLineCount();

	void addLine(String line);

	List<String[]> getAllLines();

	void setAllLines(List<String[]> lines);
}
