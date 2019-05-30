package exp.exp4;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:24
 */
public class Invoker {
    private Command command = null;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
