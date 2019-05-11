package chapter3.t21;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:55
 */
public class Client {
    public static void main(String args[]) {
        OrangeJuice juice1 = new OrangeJuice();
        GrapeJuice juice2 = new GrapeJuice();
        System.out.println("开始制作橘子汁\n");
        juice1.MakeJuice();
        System.out.println("\n开始制作葡萄汁\n");
        juice2.MakeJuice();
    }
}
