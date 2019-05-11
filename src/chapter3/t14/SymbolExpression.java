package chapter3.t14;

import java.util.HashMap;

/**
 * @Author: shuo747
 * @Date: 2019/5/11 21:27
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    //所有的解析公式都应只关心自己左右两个表达式的结果
    public SymbolExpression(Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
