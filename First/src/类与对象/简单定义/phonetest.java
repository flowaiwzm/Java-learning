package 类与对象.简单定义;

public class phonetest {
    public static void main(String[] args) {
        phone p=new phone();
        System.out.println(p.brand);//string类型输出null
        System.out.println(p.price);
        p.brand="华为";
        p.price=23333;
        System.out.println(p.price);
        p.call();
    }
    
}
