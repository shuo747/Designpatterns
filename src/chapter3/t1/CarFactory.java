package chapter3.t1;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:24
 */
public class CarFactory {
    public  Car createCar(String carType){
        if(carType.equals("BUS"))
            return new CarBus();
        if(carType.equals("TRUCK"))
            return new CarTruck();
        return null;
    }
}
