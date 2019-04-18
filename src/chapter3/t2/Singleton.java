package chapter3.t2;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:52
 */
public class Singleton {
    private static Singleton singleton;
    public static Singleton getInstance(){
        return singleton==null ? singleton : new Singleton();
    }
    private Singleton(){};

}
