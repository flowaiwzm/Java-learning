package 类与对象.封装;

public class test{
    public static void main(String[] args) {
        // 构造方法 s=new 构造方法();
        构造方法 s1=new 构造方法("李任远",20);
        s1.show();
        构造方法 s2=new 构造方法();
        s2.setAge(20);
        s2.setName("sb李任远");
        s2.show();
    }
}