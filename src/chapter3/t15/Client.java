package chapter3.t15;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:50
 */
public class Client {
    public static void main(String[] args) {
        Television tv = new HaierTV();
        Iterator it = tv.createIterator();
        System.out.println(it.first().getName());
        while (!it.isDone()) {
            System.out.println(it.next().getName());
        }
    }
}
