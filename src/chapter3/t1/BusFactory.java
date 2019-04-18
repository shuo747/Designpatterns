package chapter3.t1;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:41
 */
public class BusFactory extends AbstractCarFactory {
    @Override
    Car createCar() {
        return new  CarBus();
    }
}
