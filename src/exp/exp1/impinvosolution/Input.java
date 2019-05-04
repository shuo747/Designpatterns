package exp.exp1.impinvosolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


class Input {
	private static FileReader fr;
	private static BufferedReader br;
	
	public static void input(File file, List<String []> characters) {
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(br.ready()) {
				characters.add(br.readLine().split(" +|\t+"));
			}
			br.close();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
