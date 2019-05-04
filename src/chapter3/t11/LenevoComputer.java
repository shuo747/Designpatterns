package chapter3.t11;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:53
 */
public class LenevoComputer extends AbstractComputer {
    public LenevoComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }
    @Override
    public void checkPcAbility() {
        System.out.println("华硕笔记本CPU性能"+super.cpuAbility.abilityCpu());

    }
}
