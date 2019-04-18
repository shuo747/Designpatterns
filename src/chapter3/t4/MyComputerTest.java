package chapter3.t4;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:03
 */
public class MyComputerTest {
    public static void  main(String args[]){
        MyComputer myComputer = new MyComputer();      //组装我的电脑
        Assembler assembler = new Assembler( myComputer );  //派某一位组装师
        assembler.construct();    //组装师进行组装过程
        Commodity commodity = myComputer.getProduct();   //卖给我的电脑（商品）
    }
}
