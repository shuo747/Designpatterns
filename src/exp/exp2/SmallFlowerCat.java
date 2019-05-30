package exp.exp2;

/**
 * @Author: shuo747
 * @Date: 2019/5/16 15:30
 */
public class SmallFlowerCat implements Cat {
    private String name;

    public SmallFlowerCat(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(name + "--喵~");
    }
}
