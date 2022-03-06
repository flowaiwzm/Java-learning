package 类与对象.简单定义;

public class student {
    String name;
    int age;
    // private int age;
    // public void setAge(int a) {
    //     age=a;
    //     if(a<0||a>120){
    //         System.out.println("error");
    //     }
    // }
    // public int getAge() {
    //     return age;
    // }
    // // private String name;
    // setName()和getName()方法调用
    public void study() {
        System.out.println("好好学习");
    }
    public void dohomework() {
        System.out.println("记得做作业");
    }
    // 方法main放在栈内存，而new student()放在堆内存，通过main方法中的对象指向堆内存在进行修改
    // 调用类方法是调用完后会在栈内存中消失
    // 针对private修饰的成员变量，如果需要被其他类使用，提供相应操作1.get变量名（），2.set变量名（）
    
}
