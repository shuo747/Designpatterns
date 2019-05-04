package chapter3.t10;

/**
 * 真实主题角色，这里指红酒工厂角色，它实现了SellInterface接口
 * @Author: shuo747
 * @Date: 2019/5/4 21:46
 */
public class RedWineFactory implements SellInterface{
    public Object sell(){
        System.out.println("真实主题角色RedWineFactory 被调用了");
        return new Object();
    }

}
