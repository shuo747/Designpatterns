package exp.exp4;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:25
 */
public class Client {
    public void assemble() {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建Invoker，把命令对象设置进去
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
    }
}
