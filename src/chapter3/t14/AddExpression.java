package chapter3.t14;

import java.util.HashMap;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:36
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
