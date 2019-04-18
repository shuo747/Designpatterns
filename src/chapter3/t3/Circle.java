package chapter3.t3;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:57
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
