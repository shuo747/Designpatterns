package exp.exp1.adtsolution;
import java.util.List;

public interface CircularShift {

	void setup(Characters characters);

	void addLine(String[] line);

	String[] getLine(int lineIndex);

	String getLineAsString(int lineIndex);

	void deleteLine(int lineIndex);

	int getLineCount();

	List<String[]> getAllLines();
}
