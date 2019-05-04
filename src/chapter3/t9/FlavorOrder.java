package chapter3.t9;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:42
 */
public class FlavorOrder extends Order {
    //具体享元类
    public String flavor;
    // 获取咖啡口味
    public FlavorOrder(String flavor) {
        this.flavor = flavor;
    }
    @Override
    public void sell() {
        System.out.println("卖出一份" + flavor + "的咖啡。");
    }
}
