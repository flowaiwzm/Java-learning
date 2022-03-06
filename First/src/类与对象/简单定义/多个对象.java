package 类与对象.简单定义;

public class 多个对象 {
    public static void main(String[] args) {
        student s1=new student();
        s1.age=38;
        s1.name="李任远";
        System.out.println(s1.name+","+s1.age);
        s1.study();
        s1.dohomework();
        student s2=new student();
        s2.age=39;
        s2.name="黄彬格";
        System.out.println(s2.name+","+s2.age);
        s2.study();
        s2.dohomework();
    }
    
}
