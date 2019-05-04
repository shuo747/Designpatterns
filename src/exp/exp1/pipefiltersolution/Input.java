package exp.exp1.pipefiltersolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input extends Filter {

	private FileReader fr;
	
	public Input(File fInput, Pipe output) {
		super(null, output);
		try {
			fr = new FileReader(fInput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		middleChange();
	}

	protected void middleChange() {
		BufferedReader br = new BufferedReader(fr);
		try {
			String line;
			while((line = br.readLine()) != null) {
				output.write(line + '\n');
			}
			br.close();
			fr.close();
			output.closeWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
