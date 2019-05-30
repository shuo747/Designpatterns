package exp.exp4;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:28
 */
public class CommandChange implements Command {
    private Tv myTv;
    private int channel;

    public CommandChange(Tv tv, int channel) {
        myTv = tv;
        this.channel = channel;
    }

    public void execute() {
        myTv.changeChannel(channel);
    }
}
