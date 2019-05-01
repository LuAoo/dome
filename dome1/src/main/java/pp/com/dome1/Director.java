package pp.com.dome1;

/**
 * @author aoao on 2019/4/26
 * Summary:
 * 邮箱：1399663177@qq.com
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public Product constrcy(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
