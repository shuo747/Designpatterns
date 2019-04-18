package chapter3.t3;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 22:57
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
