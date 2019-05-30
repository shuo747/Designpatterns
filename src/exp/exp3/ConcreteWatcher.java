package exp.exp3;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:18
 */
public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
