package chapter3.t8;

/**
 * @Author: shuo747
 * @Date: 2019/5/4 21:34
 */
public class DrawerFacade {
    DrawerOne darwerOne=new DrawerOne();
    DrawerTwo darwerTwo=new DrawerTwo();
    public void open(){
        darwerOne.open();
        darwerTwo.open();
    }
}
