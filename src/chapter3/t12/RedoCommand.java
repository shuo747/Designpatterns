package chapter3.t12;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 20:12
 */
public class RedoCommand implements DocumentCommand{
    private Document document;
    public RedoCommand(Document doc) {
        document = doc;
    }
    @Override
    public void execute() {
        document.redo();
    }
}
