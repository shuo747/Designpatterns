package chapter3.t16;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:58
 */
public class User131 implements LianTongUser {
    private final String type = "131";
    private LianTongHall liantongHall;

    public User131(LianTongHall liantongHall) {
        this.liantongHall = liantongHall;
        liantongHall.identifyUserType(this, type); //联通大厅判断是那种用户
    }

    public void HandInMoney() {
        System.out.println("131用户正在交钱！");
        liantongHall.getUserMoney(type); //联通大厅得到用户交的钱
    }

    public void pleaseWait() {
        System.out.println("131用户请先等一会！");
    }
}
