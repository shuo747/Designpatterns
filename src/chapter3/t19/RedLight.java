package chapter3.t19;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:34
 */
public class RedLight extends RoadTrafficLight {
    public static boolean existRedLight = false;

    public static RedLight getRedLight() {  //获得红灯
        if (existRedLight == false) {
            existRedLight = true;
            return new RedLight();
        }
        return null;
    }
}
