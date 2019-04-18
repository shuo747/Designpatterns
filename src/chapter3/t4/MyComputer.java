package chapter3.t4;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:02
 */
public class MyComputer implements Computer {

    Part partA, partB, partC;
    public void buildPartA() {
        partA = new Part("P42.4 CPU");
    }
    public void buildPartB() {
        partB = new Part("Inter 主板");
    }
    public void buildPartC() {
        partC = new Part("80G硬盘");
    }
    public Commodity getProduct() {
    //返回最后组装成品结果
        Commodity myComputer = new Commodity (partA,partB,partC);
        return myComputer;
    }
}
