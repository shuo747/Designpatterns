package exp.exp1.pipefiltersolution;

public abstract class Filter implements Runnable {

	protected Pipe input;
	protected Pipe output;
	private boolean is_started = false;
	
	public Filter(Pipe input, Pipe output) {
		this.input = input;
		this.output = output;
	}
	
	public void start() {
		if(!is_started) {
			is_started = true;
			Thread thread = new Thread(this);
			thread.start();
		}
	}
	public void run() {
		middleChange();
	}
	
	abstract protected void middleChange();
}
