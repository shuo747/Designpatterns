package chapter3.t18;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:26
 */
public class ObserverClient {
    public static void main(String[] args) {
        Children child = new Children();
        Observer parent = new Parent();
        Observer mother = new Mother();
        Children.attach(parent);
        Children.attach(mother);
        child.setState("fight");
        child.notifyObs();
        child.setState("scholarship");
        child.notifyObs();
    }
}
