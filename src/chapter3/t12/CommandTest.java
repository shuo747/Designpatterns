package chapter3.t12;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 20:15
 */
public class CommandTest {
    public static void main(String[] args) {
        Document doc = new Document();  //客户端要把接收者对象传给具体命令对象
        DisplayCommand display = new DisplayCommand(doc);
        UndoCommand undo = new UndoCommand(doc);
        RedoCommand redo = new RedoCommand(doc);
        DocumentInvoker invoker = new DocumentInvoker(display, undo, redo);
        invoker.display();
        invoker.undo();
        invoker.redo();
    }
}
