package chapter3.t11;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:52
 */
public abstract class AbstractComputer {
    CpuAbility cpuAbility;
    public AbstractComputer(CpuAbility cpuAbility){
        this.cpuAbility=cpuAbility;
    }
    public abstract void checkPcAbility();
}
