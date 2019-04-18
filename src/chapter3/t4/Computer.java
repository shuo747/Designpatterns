package chapter3.t4;

/**
 * @Author: shuo747
 * @Date: 2019/4/17 23:01
 */
public interface Computer {
    //组装部件A　比如CPU
    void buildPartA();
    //组装部件B  比如主板
    void buildPartB();
    //组装部件C  比如硬盘
    void buildPartC();
    //返回最后组装成品结果 (返回最后组装好的电脑)
//成品的组装过程不在这里进行，而是由组装师（Assembler）类完成的。
//从而实现了过程和部件的分离
    Commodity getProduct();
}
