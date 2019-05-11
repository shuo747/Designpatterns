package chapter3.t20;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:36
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
