package exp.exp1.adtsolution;
public interface Characters {

	void setLine(int lineIndex, String[] line);

	void insertLine(int lineIndex, String[] line);

	void addLine(String[] line);

	String[] getLine(int lineIndex);

	String getLineAsString(int lineIndex);

	void deleteLine(int lineIndex);

	int getLineCount();

	void addLine(String line);
}
