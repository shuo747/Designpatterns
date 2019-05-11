package chapter3.t21;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 22:40
 */
public abstract class FruitJuice {
    public abstract void AddWater(); // 加水
    public abstract void AddFruit(); // 加水果
    public abstract void AddIceBlock(); // 加冰
    public abstract void AddLemonSlice(); // 加柠檬片
    public void MakeJuice() // 制作果汁
    {
        AddWater();
        AddFruit();
        AddIceBlock();
        AddLemonSlice();
        System.out.println("果汁已经做好！");
    }
}
