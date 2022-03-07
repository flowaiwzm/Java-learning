package API;

public class StringBuilder1 {
    // 如果对字符串进行拼接操作每次拼接都会创建一个新的string对象，耗时浪费内存，此时我们通过Stringbuilder来解决该问题。它是一个可变的字符串类相当于一个容器
    //Stringbuilder().创建一个空白的可变字符串对象
    // public  String builder（String str） 
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder("gfdhgfh");
        System.out.println("sb2="+sb2);
        // public Stringbuilder append（任意类型），返回本身
        // public StringBuilder reverse() 返回相反序列
    }
}
