package chapter3.t11;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:55
 */
public class Client {
    public static void main(String agr[])
    {
        CpuAbility ability =new IntelCpu();
        AbstractComputer computer =new LenevoComputer(ability);
        computer.checkPcAbility();
        ability =new AmdCpu();//华硕笔记本CPU性能较好
        computer =new IbmComputer(ability);
        computer.checkPcAbility();//IBM笔记本CPU性能一般
    }
}
