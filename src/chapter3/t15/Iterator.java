package chapter3.t15;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:43
 * Item:即是集合中的各对象的类型.若为String，即把所有的ITEM改为String，若为其它自定义的类，则改为各自定义的接口或类
 */
interface Iterator {

    public Item first();

    public Item next();

    public boolean isDone();

    public Item currentItem();

}
