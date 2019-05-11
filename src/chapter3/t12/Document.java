package chapter3.t12;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 20:06
 * 请求接收者，负责执行各命令
 */
public class Document {
    public void display() {  //显示命令
        System.out.println("显示文档内容");
    }
    public void undo() {  //撤消命令
        System.out.println("撤销文档内容");
    }
    public void redo() {
        System.out.println("重做文档内容");
    }
}
