package chapter3.t1;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:26
 */
public class Client {
    public static void main(String[] args) {
        
        
        /*工厂*/
        factoryDemo();
        /*抽象工厂*/
        absractfactoryDemo();


    }

    private static void absractfactoryDemo() {
        AbstractCarFactory factory = new BusFactory();
        //生产公交车
        Car bus = factory.createCar();
        System.out.println("生产了：" + bus.getType());

        factory = new TruckFactory();
        //生产卡车
        Car truck = factory.createCar();
        System.out.println("生产了：" + truck.getType());
    }

    private static void factoryDemo() {
        CarFactory factory = new CarFactory();
        //生产公交车
        Car bus = factory.createCar("BUS");
        System.out.println("生产了：" + bus.getType());

        //生产卡车
        Car truck = factory.createCar("TRUCK");
        System.out.println("生产了：" + truck.getType());
    }
}
