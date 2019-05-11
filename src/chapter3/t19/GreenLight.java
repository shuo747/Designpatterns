package chapter3.t19;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:34
 */
public class GreenLight extends RoadTrafficLight {
    public static boolean existGreenLight = false;

    public static GreenLight getGreenLight() { //获得绿灯
        if (existGreenLight == false) {
            existGreenLight = true;
            return new GreenLight();
        }
        return null;
    }
}
