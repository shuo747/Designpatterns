package chapter3.t5;

import java.util.ArrayList;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:06
 */
public class Test {
    public static void main(String args[]){
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        Dog dog =new Dog();
        for(int i=0;i<4;i++){
            SmallFlowerCat cat = new SmallFlowerCat("小花猫"+(i+1)+"号");
            catArrayList.add(cat);
        }
        Cat dogToCat = new CatAdapter(dog);
        catArrayList.add(dogToCat);
        for(Cat c:catArrayList){
            c.sing();
        }
    }
}
