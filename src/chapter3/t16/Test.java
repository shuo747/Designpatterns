package chapter3.t16;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:06
 */
public class Test {
    public static void main(String[] args) {
        LianTongHall gaoxinLianTongHall = new ConcreteLianTongHall(); //高新联通大厅
        User130 zhangsan = new User130(gaoxinLianTongHall); //张三
        User131 lisi = new User131(gaoxinLianTongHall);   //李四
        User133 me = new User133(gaoxinLianTongHall);   //我
        zhangsan.HandInMoney();  //张三交钱
        lisi.HandInMoney();  //李四交钱
        me.HandInMoney();   //我交钱
    }
}
