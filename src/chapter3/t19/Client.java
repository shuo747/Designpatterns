package chapter3.t19;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:35
 */
public class Client {
    public static void main(String args[]) {
        ControlCenter controlCenter = new ControlCenter();   //控制中心
        RoadTrafficLight redLight = RedLight.getRedLight();  //红灯
        RoadTrafficLight greenLight = GreenLight.getGreenLight(); //绿灯
        RoadTrafficLight yellowLight = YellowLight.getYellowLight(); //黄灯
        controlCenter.changeState(redLight); //改变成红灯状态
        controlCenter.showRedLight();  //显示红灯
        controlCenter.changeState(yellowLight); //改变成黄灯状态
        controlCenter.showYellowLight();  //显示黄灯
        controlCenter.changeState(greenLight);  //改变成绿灯状态
        controlCenter.showGreenLight(); //显示绿灯
    }
}
