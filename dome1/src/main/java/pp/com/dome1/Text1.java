package pp.com.dome1;

/**
 * @author aoao on 2019/4/26
 * Summary:
 * 邮箱：1399663177@qq.com
 */
public class Text1 {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.constrcy();
    }
}
