package chapter3.t3;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:57
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
