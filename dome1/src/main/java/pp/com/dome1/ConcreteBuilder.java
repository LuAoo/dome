package pp.com.dome1;

/**
 * @author aoao on 2019/4/26
 * Summary:
 * 邮箱：1399663177@qq.com
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("A");
    }

    @Override
    public void buildPartB() {
        System.out.println("B");
    }

    @Override
    public void buildPartC() {
        System.out.println("C");
    }
}
