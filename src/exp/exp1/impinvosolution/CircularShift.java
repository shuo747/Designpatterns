package exp.exp1.impinvosolution;

import java.util.List;

class CircularShift {
	private static final String noiseWords = "a an and "; 
	
	public static void circularShift(List<String []> characters, List<Pair> index) {
		for(int i = 0; i < characters.size(); i++) {
			String []line = characters.get(i);
			for(int j = 0; j < line.length; j++) {
				if(noiseWords.indexOf((line[j] + " ").toLowerCase()) == -1) {
					Pair pair = new Pair(i, j);
					index.add(pair);
				}
			}
		}
	}
}
