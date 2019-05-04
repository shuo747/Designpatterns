package exp.exp1.pipefiltersolution;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CircularShift extends Filter {

	private static final String noiseWords = "a an and ";
	
	public CircularShift(Pipe input, Pipe output) {
		super(input, output);
		middleChange();
	}

	protected void middleChange() {
		try {
			CharArrayWriter writer= new CharArrayWriter();
			int c = -1;
			while((c = input.read()) != -1) {
				if(c == 10) {
					String curLine = writer.toString();
					String[] words = curLine.split(" +|\t+"); 
					for(int i = 0; i < words.length; i++) {
						if(noiseWords.indexOf((words[i] + " ").toLowerCase()) != -1)
							continue;
						String shift = "";
						for(int j = i; j < (words.length + i); j++) {
							shift += words[j % words.length];
							if (j < (words.length + i - 1))
								shift += " ";
						}
						shift += "\r\n";
						output.write(shift);
						writer.reset();
					}
				} else 
					writer.write(c);
			}
			input.closeReader();
			output.closeWriter();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
