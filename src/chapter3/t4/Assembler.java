package chapter3.t4;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:01
 */
public class Assembler {
    private Computer computer;
    public Assembler(Computer computer) {  //主要任务是装电脑
        this.computer = computer;
    }
    // 将部件partA partB partC最后组成复杂对象
    //这里是将主板、CPU和硬盘组装成PC的过程
    public void construct() {
        computer.buildPartA();
        computer.buildPartB();
        computer.buildPartC();
    }
}
