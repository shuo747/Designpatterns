package exp.exp4;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:23
 */
public class ConcreteCommand implements Command {
    private Receiver receiver = null;
    private String state;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
