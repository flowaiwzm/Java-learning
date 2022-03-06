package 类与对象.简单定义;

public class phone {
    // 类：是对现实生活中一类具有共同属性和行为的事件的 
    // 类包含属性和行为（去除static关键字的方法）
    // 对象：是我们能看到摸得着的真实的实体
    //    成员变量
        String brand;
        int price;
        public void call(){
            System.out.println("打你吗");
        }
        public void messsge(){
            System.out.println("发你妈");
        }
    // 对象的使用1.创建对象 类名 对象名=new 类名（）;
    // 2.使用对象变量 对象名.变量名
    // 3.使用对象成员函数 对象名.方法名()
}
