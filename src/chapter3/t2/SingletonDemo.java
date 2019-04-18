package chapter3.t2;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:52
 */
public class SingletonDemo {
    //
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1==s2)
            System.out.println("s1 is the same instance with s2");
        else
            System.out.println("s1 is not the same instance with s2");
    }
}
