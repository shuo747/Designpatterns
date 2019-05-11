package chapter3.t20;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:37
 * 中级会员折扣类
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
