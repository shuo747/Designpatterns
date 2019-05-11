package chapter3.t15;

import java.util.Vector;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:48
 */
public class HaierTV implements Television {
    private Vector channel;

    public HaierTV() {
        channel = new Vector();
        channel.addElement(new Item("channel 1"));
        channel.addElement(new Item("channel 2"));
        channel.addElement(new Item("channel 3"));
        channel.addElement(new Item("channel 4"));
        channel.addElement(new Item("channel 5"));
        channel.addElement(new Item("channel 6"));
        channel.addElement(new Item("channel 7"));
    }

    public Iterator createIterator() {
        return new Controller(channel);
    }
}
