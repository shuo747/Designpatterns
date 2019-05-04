package chapter3.t7;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:29
 */
public class Client {
    public static void main(String args[]) {
        Project employee = new Employee();        //代码工人
        Project managerA = new ManagerA(employee); //项目经理
        Project managerB = new ManagerB(employee); //项目经理
        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人
        managerA.doCoding();
        managerB.doCoding();
    }
}
