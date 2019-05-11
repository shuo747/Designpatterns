package chapter3.t15;

import java.util.Vector;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:45
 */
public class Controller implements Iterator {
    private int current = 0;
    Vector channel;

    public Controller(Vector v) {
        channel = v;
    }

    public Item first() {
        current = 0;
        return (Item) channel.get(current);
    }

    public Item next() {
        current++;
        return (Item) channel.get(current);
    }

    public Item currentItem() {
        return (Item) channel.get(current);
    }

    public boolean isDone() {
        return current >= channel.size() - 1;
    }
}
