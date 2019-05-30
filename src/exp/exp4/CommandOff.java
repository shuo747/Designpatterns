package exp.exp4;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:27
 */
public class CommandOff implements Command {
    private Tv myTv;

    public CommandOff(Tv tv) {
        myTv = tv;
    }

    public void execute() {
        myTv.turnOff();
    }
}
