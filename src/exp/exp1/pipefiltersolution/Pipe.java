package exp.exp1.pipefiltersolution;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Pipe {

	private PipedWriter pipedWriter;
	private PipedReader pipedReader;

	public Pipe() throws IOException {
		pipedReader = new PipedReader();
		pipedWriter = new PipedWriter();
		pipedReader.connect(pipedWriter);
	}
	
	public int read() throws IOException {
		return pipedReader.read();
	}
	
	public void write(int c) throws IOException {
		pipedWriter.write(c);
	}

	public void write(String s, int off, int len) throws IOException {
		pipedWriter.write(s.toCharArray(), off, len);
	}
	

	public void write(String s) throws IOException {
		pipedWriter.write(s.toCharArray());
	}
	
	public void closeReader() throws IOException {
		pipedReader.close();
	}

	public void closeWriter() throws IOException {
		pipedWriter.flush();
		pipedWriter.close();
	}
}
