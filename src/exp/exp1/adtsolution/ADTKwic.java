package exp.exp1.adtsolution;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import exp.exp1.adtsolution.implement.*;

public class ADTKwic {

	public static void main(String[] args) throws IOException {
		File fInput = new File("KWIC_input.txt");
		File fOutput = new File("KWIC_output.txt");

		Input input = new Input();
		Characters characters = new CharactersImplement();
		input.input(fInput, characters);

		CircularShift circularShift = new CircularShiftImplement();
		circularShift.setup(characters);

		Alphabetizer alphabetizer = new AlphabetizerImplement();
		alphabetizer.alph(circularShift);

		Output output = new Output();
		output.output(fOutput, alphabetizer);

		System.out.println("�������2��ADT\n");
		System.out.println("�����ÿ�У�");
		printFile("KWIC_input.txt");
		System.out.println();
		System.out.println("����KWICϵͳ�������ÿ�н����");
		printFile("KWIC_output.txt");
	}

	private static void printFile(String string) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream(string));
		String eachLine = in.readLine();

		while (eachLine != null) {
			System.out.println(eachLine);
			eachLine = in.readLine();
		}

		in.close();
	}
	

}
