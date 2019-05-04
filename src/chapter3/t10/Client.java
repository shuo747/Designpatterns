package chapter3.t10;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:49
 */
public class Client {
    public static void main(String agr[]) {
        SellInterface sell = new RedWineProxy();
        sell.sell();
    }
}
