package exp.exp1.pipefiltersolution;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class pipefilter {

	public static void main(String[] args) throws IOException {
			File fInput = new File("KWIC_input.txt");
			File fOutput = new File("KWIC_output.txt");
			Pipe in_cs = new Pipe();
			Pipe cs_al = new Pipe();
			Pipe al_ou = new Pipe();
							
			new Input(fInput, in_cs);
		
			new CircularShift(in_cs, cs_al);
		
			new Alphabetizer(cs_al, al_ou);
		
			new Output(al_ou, fOutput);
			
			System.out.println("�������4��pipefilter\n");
			System.out.println("�����ÿ�У�");
			printFile("KWIC_input.txt");
			System.out.println();
			System.out.println("����KWICϵͳ�������ÿ�н����");
			printFile("KWIC_output.txt");
		}
		
	private static void printFile(String string) throws IOException {
			DataInputStream in = new DataInputStream(new FileInputStream(string));
			String i=in.readLine();
				
			while(i!=null){
				System.out.println(i);
				i=in.readLine();
			}
			in.close();
		}
}