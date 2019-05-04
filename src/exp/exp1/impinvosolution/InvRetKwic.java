package exp.exp1.impinvosolution;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InvRetKwic {

	public static void main(String[] args) throws IOException {
		File fInput = new File("KWIC_input.txt");
		File fOutput = new File("KWIC_output.txt");
		List<String []> characters = new ArrayList<String []>();
		List<Pair> index = new ArrayList<Pair>();
		List<Pair> alphabetedIndex = new ArrayList<Pair>();
		Input.input(fInput, characters);
		CircularShift.circularShift(characters, index);
		Alphabetizer.alphabetizer(characters, index, alphabetedIndex);
		Output.output(characters, alphabetedIndex, fOutput);			
		
		System.out.println("解决方案3:Implicit Invocation：\n");
		System.out.println("输入的每行：");
		printFile("KWIC_input.txt");
		System.out.println();
		System.out.println("经过KWIC系统后输出的每行结果：");
		printFile("KWIC_output.txt");	
	}
	private static void printFile(String string) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream(string));
		String i = in.readLine();

		while (i != null) {
			System.out.println(i);
			i = in.readLine();
		}

		in.close();
	}


}
