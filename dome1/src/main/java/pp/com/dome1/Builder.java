package pp.com.dome1;

/**
 * @author aoao on 2019/4/26
 * Summary:
 * 邮箱：1399663177@qq.com
 */
public abstract class Builder {
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public Product getResult(){
        return product;
    }
}
