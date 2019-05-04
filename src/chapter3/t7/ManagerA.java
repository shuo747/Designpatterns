package chapter3.t7;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:28
 */
public class ManagerA extends Manager {
    public ManagerA(Project project) {
        super(project);
    }
    /**
     * 项目经理自己的事情：做早期工作
     */
    public void doEarlyWork() {
        System.out.println("项目经理A 在做需求分析");
        System.out.println("项目经理A 在做架构设计");
        System.out.println("项目经理A 在做详细设计");
    }
}
