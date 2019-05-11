package chapter3.t19;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:33
 */
public class RoadTrafficLight implements TrafficLight {
    public void showRedLight() {
        System.out.println("红灯亮了，不能通过！");
    }

    public void showGreenLight() {
        System.out.println("绿灯亮了，可以通过！");
    }

    public void showYellowLight() {
        System.out.println("黄灯亮了!");
    }
}
