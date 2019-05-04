package exp.exp1.pipefiltersolution;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output extends Filter {
	
	private FileWriter fileWriter;
	
	public Output(Pipe input, File fOutput) {
		super(input, null);
		try {
			fileWriter = new FileWriter(fOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		start();
	}

	protected void middleChange() {
		BufferedWriter bw = new BufferedWriter(fileWriter);
		
		try {
			int c = -1;
			while((c = input.read()) != -1) {
				bw.write(c);
			}
			input.closeReader();
			bw.flush();
			bw.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
