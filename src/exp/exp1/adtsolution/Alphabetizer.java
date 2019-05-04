package exp.exp1.adtsolution;
import java.util.List;

public interface Alphabetizer {

	void alph(CircularShift circularShift);

	void addLine(String[] line);

	String[] getLine(int lineIndex);

	int getLineCount();

	void setLine(int lineIndex, String[] line);

	String getLineAsString(int lineIndex);

	List<String[]> getAllLines();

	void setAllLines(List<String[]> lines);
}
