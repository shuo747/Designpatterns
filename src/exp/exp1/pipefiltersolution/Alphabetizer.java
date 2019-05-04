package exp.exp1.pipefiltersolution;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer extends Filter {

	public Alphabetizer(Pipe input, Pipe output) {
		super(input, output);
		middleChange();
	}

	protected void middleChange() {
		ArrayList <String> lines = new ArrayList<String>();
		CharArrayWriter writer = new CharArrayWriter();
		try {
			int c = -1;
			while((c = input.read()) != -1) {
				writer.write(c);
				if(c == 10) {
					String curLine = writer.toString();
					lines.add(curLine);
					writer.reset();
				}
			}
			
			alpha(lines);
			
			for(String s : lines) {
				output.write(s);
			}
			
			input.closeReader();
			output.closeWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static ArrayList<String> alpha(ArrayList<String> lines) {
	
		ArrayList<String> tmp_lines = new ArrayList<String>();
		
		for(String i:lines){
			i=convertString(i);
			tmp_lines.add(i);
		}
	
		Collections.sort(tmp_lines);
		
		lines.clear();
		
		for(String i:tmp_lines){
			i=convertString(i);
			lines.add(i);
		}
		
		return lines;
	}
	
	static String convertString(String str) {
		String upStr = str.toUpperCase();
		String lowStr = str.toLowerCase();
		StringBuffer buf = new StringBuffer(str.length());

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == upStr.charAt(i)) {
				buf.append(lowStr.charAt(i));
			} else {
				buf.append(upStr.charAt(i));
			}
		}
		return buf.toString();
	} 
}
