package chapter3.t11;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:53
 */
public class IbmComputer extends AbstractComputer {
    public IbmComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }
    @Override
    public void checkPcAbility() {
        System.out.println("IBM笔记本CPU性能"+super.cpuAbility.abilityCpu());

    }
}
