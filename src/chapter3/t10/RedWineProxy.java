package chapter3.t10;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:48
 */
public class RedWineProxy implements SellInterface {
    //持有一个RedWineFactory对象的引用
    private RedWineFactory redWineFactory;
    //销售总量
    private static int count = 0;
    public Object sell(){
        if(checkUser()){//在通过代理主题角色，我们可以在真实主题角色被调用前做一些诸如权限判断的事情
            if(redWineFactory==null) redWineFactory = new RedWineFactory();
            Object obj = redWineFactory.sell();
            count ++;//同样,在调用后我们也可以执行一些额外的动作.
            return obj ;
        }else{
            throw new RuntimeException();
        }
    }
    protected boolean checkUser(){
        //do something
        return true;
    }
}
