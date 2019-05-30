package exp.exp2;

/**
 * @Author: shuo747
 * @Date: 2019/5/16 15:31
 */
public class CatAdapter implements Cat {
    private Dog mDog;

    public CatAdapter(Dog dog) {
        mDog = dog;
    }

    @Override
    public void sing() {
        mDog.bake();
    }
}
