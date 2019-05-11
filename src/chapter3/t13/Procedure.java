package chapter3.t13;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:17
 */
public interface Procedure {
    public abstract void nextProcedure(Procedure procedure);  //下一工序
    public abstract void executeProcedure(String aim);  //执行工序
}
