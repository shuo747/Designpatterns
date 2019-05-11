package chapter3.t16;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:52
 */
public class ConcreteLianTongHall implements LianTongHall {
    private User130 user130;
    private User131 user131;
    private User133 user133;

    public void identifyUserType(LianTongUser user, String type) {
        if (type == "130") {
            user130 = (User130) user; //130用户
        } else if (type == "131") {
            user131 = (User131) user; //131用户
        } else if (type == "133") {
            user133 = (User133) user; //133用户
        }
    }

    public void getUserMoney(String type) {  //得到用户交的钱
        if (type == "130") {
            user131.pleaseWait();  //131用户请先等
            user133.pleaseWait();  //133用户请先等
        } else if (type == "131") {
            user130.pleaseWait();   //130用户请先等
            user133.pleaseWait();   //133用户请先等
        } else if (type == "133") {
            user130.pleaseWait();  //130用户请先等
            user131.pleaseWait();  //131用户请先等
        }
    }
}
