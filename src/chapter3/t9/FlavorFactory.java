package chapter3.t9;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:43
 */
public class FlavorFactory {
    private Map<String, Order> flavorPool = new HashMap<String, Order>();
    // 静态工厂,负责生成订单对象，享元工厂
    private static FlavorFactory flavorFactory = new FlavorFactory();
    private FlavorFactory() {
    }
    public static FlavorFactory getInstance() {
        return flavorFactory;
    }

    public Order getOrder(String flavor) {
        Order order = null;
        if (flavorPool.containsKey(flavor)) {// 如果此映射包含指定键的映射关系，则返回 true
            order = flavorPool.get(flavor);
        } else {
            order = new FlavorOrder(flavor);
            flavorPool.put(flavor, order);
        }
        return order;
    }
    public int getTotalFlavorsMade() {
        return flavorPool.size();
    }
}
