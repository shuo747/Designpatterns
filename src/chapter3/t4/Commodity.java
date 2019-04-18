package chapter3.t4;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:00
 */
public class Commodity {
    String commodity ="";
    public Commodity (Part partA,Part partB,Part partC) {//由各个部分组成
        this. commodity = partA.part+"\n";
        this. commodity = commodity+partB.part+"\n";
        this. commodity = commodity+partC.part;
        System.out.println("我的机器配置为：\n"+ commodity);
    }
}
