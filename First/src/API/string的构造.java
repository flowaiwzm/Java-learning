package API;

public class string的构造 {
    // public string()创建一个空白字符串对象，不含任何内容
    // public string(char[] chs/byte[] bys)根据字符数组来创建字符串对象
    // strings s="abs"直接赋值的方法创建对象
    public static void main(String[] args) {
        String s1=new String();
        System.out.println("s1"+s1);//空白内容
        char[] chs={'a'};
        String s2=new String(chs);
        byte[] bys={37,34,23};
        String s3=new String(bys);
        String s4="abc";
        System.out.println(s4);
    }
}
