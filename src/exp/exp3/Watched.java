package exp.exp3;

/**
 * @Author: shuo747
 * @Date: 2019/5/30 22:10
 * 被观察
 */
public interface Watched {
    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);
}
