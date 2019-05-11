package chapter3.t13;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:23
 * 编码工序
 */
public class CodeProcedure implements Procedure{
    private Procedure nextProcedure = null;
    private String procedureName = "Code"; //该工序名
    public void nextProcedure(Procedure procedure) { //下一工序
        nextProcedure = procedure;
    }
    public void executeProcedure(String currentProcedure) { //执行工序
        if(currentProcedure.equals(procedureName)) {//如果当前工序和该工序相符
            System.out.println("进行编码工作");
        } else {
            if(nextProcedure != null) { //如果当前工序和该工序不相符则转入下一工序
                nextProcedure.executeProcedure(currentProcedure);
            }
        }
    }
}
