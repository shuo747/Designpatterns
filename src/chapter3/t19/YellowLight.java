package chapter3.t19;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:34
 */
public class YellowLight extends RoadTrafficLight {
    public static boolean existYellowLight = false;

    public static YellowLight getYellowLight() { //获得黄灯
        if (existYellowLight == false) {
            existYellowLight = true;
            return new YellowLight();
        }
        return null;
    }
}
