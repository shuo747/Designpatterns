package chapter3.t14;

import java.util.HashMap;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:27
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String _key) {
        this.key = _key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
