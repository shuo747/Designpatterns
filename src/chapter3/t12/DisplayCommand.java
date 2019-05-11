package chapter3.t12;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 20:12
 */
public class DisplayCommand implements DocumentCommand{
    private Document document;
    public DisplayCommand(Document doc) {
        document = doc;
    }
    @Override
    public void execute() {
        document.display();
    }
}
