package chapter3.t18;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:25
 */
public class Parent implements Observer {
    @Override
    public void update(Children child) {
        switch (child.getState()) {  //使用Java 7的switch语句对string的判断支持
            case "fight":
                System.out.println("Parent，他和别人打架了");
                break;
            case "scholarship":
                System.out.println("告诉Parent，他得到了奖学金");
                break;
        }
    }
}
