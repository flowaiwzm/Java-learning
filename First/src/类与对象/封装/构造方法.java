package 类与对象.封装;

public class 构造方法 {
    // 构造方法是一种特殊的方法作用：创建对象,功能完成对象的数据初始化
    private String name;
    private int age;
    // public 构造方法(){
    //     System.out.println("无参构造方法");
    // }
    public 构造方法(){}//一旦给定构造方法就不会自动给定默认构造函数（无参构造函数）
    public 构造方法(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void show() {
        System.out.println(name+","+age);
    }
    
}
