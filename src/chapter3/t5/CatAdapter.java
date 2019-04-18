package chapter3.t5;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:06
 */
public class CatAdapter implements Cat {
    private Dog mDog;
    public CatAdapter(Dog dog){
        mDog = dog;
    }
    @Override
    public void sing() {
        mDog.bake();
    }
}
