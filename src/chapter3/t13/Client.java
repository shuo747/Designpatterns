package chapter3.t13;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:25
 */
public class Client {
    public static void main(String[] args) {
        DesignProcedure design = new DesignProcedure();  //分析设计工序
        CodeProcedure code = new CodeProcedure();  //编码工序
        TestProcedure test = new TestProcedure();  //测试工序
        design.nextProcedure(code);  //定义分析设计工序的下一工序
        code.nextProcedure(test);   //定义编码工序的下一工序
        design.executeProcedure("Design"); //开始执行工序
        design.executeProcedure("Code");
        design.executeProcedure("Test");
    }
}
