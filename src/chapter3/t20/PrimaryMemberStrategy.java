package chapter3.t20;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:37
 * 初级会员折扣类
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}