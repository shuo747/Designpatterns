package chapter3.t5;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:05
 */
public class SmallFlowerCat implements Cat {
    private String name;

    public  SmallFlowerCat(String name){
        this.name = name;
    }
    @Override
    public void sing() {
        System.out.println(name+"--喵~");
    }
}
