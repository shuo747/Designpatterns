package chapter3.t18;

import java.util.ArrayList;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:13
 * ConcreteSubject:被观察者，即ConcreteObservable
 */
public class Children {
    static private ArrayList<Observer> obs; //维护一个观察者列表
    static private String state = null;

    static {
        obs = new ArrayList<>();
    }

    //添加观察者
    public static void attach(Observer o) {
        obs.add(o);
    }

    //删除观察者
    public static void detach(Observer o) {
        obs.remove(o);
    }

    //被观察对象的状态
    public void setState(String str) {
        state = str;
    }

    public String getState() {
        return state;
    }

    //状态改变时通知所有观察者
    public void notifyObs() {
        for (Observer o : obs) {
            o.update(this);  //使观察者更新状态
        }
    }
}
