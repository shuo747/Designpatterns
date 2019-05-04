package exp.exp1.impinvosolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Alphabetizer {

	public static void alphabetizer(List<String []> characters, List<Pair> index, List<Pair> alphabetedIndex) {
		alphabetedIndex.addAll(index);
		
		for(int i = 1; i < alphabetedIndex.size(); i++) {
			Pair temp = alphabetedIndex.get(i);
			int wordIndex1 = temp.getWordIndex();
			int lineIndex1 = temp.getLineIndex();
			String str1 = characters.get(lineIndex1)[wordIndex1];
			int j;
			for(j = i - 1; j >= 0; j--) {

				int wordIndex2 = alphabetedIndex.get(j).getWordIndex();
				int lineIndex2 = alphabetedIndex.get(j).getLineIndex();
				
				String str2 = characters.get(lineIndex2)[wordIndex2];
				if(convertString(str1).compareTo(convertString(str2)) < 0) {
					alphabetedIndex.set(j + 1, alphabetedIndex.get(j));
				} else break;
			}
			alphabetedIndex.set(j + 1, temp);
		}
		
		
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
