package chapter3.t19;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:33
 */
public class ControlCenter {
    private RoadTrafficLight trafficLight; //道路交通灯

    public void changeState(RoadTrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public void showRedLight() { //显示红灯
        trafficLight.showRedLight();
    }

    public void showGreenLight() { //显示绿灯
        trafficLight.showGreenLight();
    }

    public void showYellowLight() { //显示黄灯
        trafficLight.showYellowLight();
    }
}
