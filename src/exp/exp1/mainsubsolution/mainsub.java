package exp.exp1.mainsubsolution;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class mainsub {
	private static final String noiseWords = "a an and ";
	
	public static void main(String[] args) throws IOException {
			String fInput = "KWIC_input.txt";
			String fOutput = "KWIC_output.txt";
			

			ArrayList <String> lines = input(fInput);
			
			System.out.println("解决方案1：Main Program/Subroutine with Shared Data\n");
			System.out.println("输入的每行：");
		
			output(lines);
			
			//循环移位
			lines = CircularShift(lines);
			
			//排序
			lines = Alphabetizer(lines);
			
			System.out.println();
			
			//输出
			System.out.println("经过KWIC系统后输出的每行结果：");
			output(lines,fOutput);
			output(lines);

		}
	
	private static ArrayList<String> CircularShift(ArrayList<String> lines) {
		ArrayList<String> tmp_lines = new ArrayList<String>();
		for(String i:lines){
			CircularShiftLine(i,tmp_lines);
		}
		return tmp_lines;
		
	}

	private static void CircularShiftLine(String curLine,ArrayList<String> tmp_lines) {
		
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
			tmp_lines.add(shift);
		}
		return;
		
	}
	
	private static ArrayList<String> Alphabetizer(ArrayList<String> lines) {

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
	
	private static ArrayList<String> input(String string) throws IOException{
		
		DataInputStream in = new DataInputStream(new FileInputStream(string));
		
		ArrayList <String> lines = new ArrayList<String>();
		
		String curLine=in.readLine();
		while(curLine!=null){
			lines.add(curLine);
			curLine=in.readLine();
		}
		in.close();
		return lines;
		}
	
	static void output(ArrayList <String> lines,String output) throws FileNotFoundException{
		PrintWriter fileWriter = new PrintWriter(output);
		for(String i:lines)
			fileWriter.println(i);
		fileWriter.close();
	}
	
	static void output(ArrayList <String> lines){
		for(String i:lines)
			System.out.println(i);
	}
	
}