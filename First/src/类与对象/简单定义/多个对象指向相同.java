package 类与对象.简单定义;

public class 多个对象指向相同 {
    public static void main(String[] args) {
        student s1=new student();
        s1.age=38;
        // s1.setAge(30);
        s1.name="李任远";
        System.out.println(s1.name+","+s1.age);
        s1.study();
        s1.dohomework();
        student s2=s1;
        s2.age=39;
        s2.name="黄彬格";
        System.out.println(s1.name+","+s1.age);
        System.out.println(s2.name+","+s2.age);
        s2.study();
        s2.dohomework();
        //与不同对象指向不同的区别，此时修改的是同一个内存上个对象的值也会改变
    }
    
}
