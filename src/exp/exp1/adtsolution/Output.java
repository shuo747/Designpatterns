package exp.exp1.adtsolution;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;

	public void output(File fOutput, Alphabetizer alphabetizer) {
		try {
			fileWriter = new FileWriter(fOutput);
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < alphabetizer.getLineCount(); i++) {
				String line = alphabetizer.getLineAsString(i);
				bufferedWriter.write(line);
				bufferedWriter.write("\r\n");
			}

			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
