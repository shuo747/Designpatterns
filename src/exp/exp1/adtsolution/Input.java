package exp.exp1.adtsolution;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {

	private FileReader fileReader;
	private BufferedReader bufferdReader;

	public void input(File fInput, Characters characters) {
		try {
			fileReader = new FileReader(fInput);
			bufferdReader = new BufferedReader(fileReader);
			while (bufferdReader.ready()) {
				characters.addLine(bufferdReader.readLine());
			}
			bufferdReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
