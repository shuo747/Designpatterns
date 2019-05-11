package chapter3.t12;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 20:14
 * 命令请求者
 */
public class DocumentInvoker {
    private DisplayCommand _dcmd;
    private UndoCommand _ucmd;
    private RedoCommand _rcmd;

    public DocumentInvoker(DisplayCommand dcmd, UndoCommand ucmd, RedoCommand rcmd) {
        this._dcmd = dcmd;
        this._ucmd = ucmd;
        this._rcmd = rcmd;
    }

    public void display() { //调用命令对象执行请求，即把命令执行转发给命令对象
        _dcmd.execute();
    }

    public void undo() {
        _ucmd.execute();
    }

    public void redo() {
        _rcmd.execute();
    }
    /* 要对请求进行排队、调度时可用下面的方式实现
     private java.util.ArrayList<Command> comList=new java.util.ArrayList<Command>();
     public void addCommand(Command com){
        comList.add(com);
     }
     public void schedulePerform(){
        for(Command co:comList){
            co.execute();
        }
     }
     */
}
