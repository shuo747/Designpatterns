package exp.exp1.adtsolution.implement;

import exp.exp1.adtsolution.Alphabetizer;
import exp.exp1.adtsolution.CircularShift;
import exp.exp1.adtsolution.LineStorage;

import java.util.Comparator;
import java.util.List;


public class AlphabetizerImplement implements Alphabetizer {
	private LineStorage lineStorage = new LineStorageImplement();

	public AlphabetizerImplement() {
	}

	public AlphabetizerImplement(LineStorage lineStorage) {
		this.lineStorage = lineStorage;
	}

	public LineStorage getLineStorage() {
		return lineStorage;
	}

	public void setLineStorage(LineStorage lineStorage) {
		this.lineStorage = lineStorage;
	}

	public void addLine(String[] line) {
		lineStorage.addLine(line);
	}

	public void alph(CircularShift circularShift) {
		List<String[]> lines = circularShift.getAllLines();
		qSort(lines, 0, lines.size() - 1, new Comparator<String[]>() {

			public int compare(String[] o1, String[] o2) {
				if (convertString(o1[0]).compareTo(convertString(o2[0])) == 0)
					return 0;
				else if (convertString(o1[0]).compareTo(convertString(o2[0])) > 0)
					return 1;
				else
					return -1;
			}

		});

		setAllLines(lines);
	}

	public String[] getLine(int lineIndex) {
		return lineStorage.getLine(lineIndex);
	}

	public int getLineCount() {
		return lineStorage.getLineCount();
	}

	public void setLine(int lineIndex, String[] line) {
		lineStorage.setLine(lineIndex, line);
	}

	public String getLineAsString(int lineIndex) {
		return lineStorage.getLineAsString(lineIndex);
	}

	public List<String[]> getAllLines() {
		return lineStorage.getAllLines();
	}

	public void setAllLines(List<String[]> lines) {
		lineStorage.setAllLines(lines);
	}

	
	public static <T> void qSort(List<T> a, int p, int r,
			Comparator<? super T> c) {
		if (p < r) {
			int q = partition(a, p, r, c);
			qSort(a, p, q - 1, c);
			qSort(a, q + 1, r, c);
		}
	}

	private static <T> int partition(List<T> a, int p, int r,
			Comparator<? super T> c) {
		int i = p;
		int j = r + 1;
		while (true) {

			while (c.compare(a.get(++i), a.get(p)) <= 0)
				if (i == r)
					break;
			while (c.compare(a.get(p), a.get(--j)) <= 0)
				if (j == p)
					break;
			if (i >= j)
				break;
			swap(a, i, j);
		}
		swap(a, j, p);
		return j;
	}

	private static <T> void swap(List<T> a, int i, int j) {
		T temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
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
