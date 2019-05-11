package chapter3.t16;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:51
 * 联通大厅接口
 */
public interface LianTongHall {
    public void identifyUserType(LianTongUser user, String type);  //判断用户类型
    public void getUserMoney(String type);  //获得用户交的钱
}
