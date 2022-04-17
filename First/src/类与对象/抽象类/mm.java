package 类与对象.抽象类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

// import 类与对象.简单定义.student;

interface person{
    public abstract void study();
}
class personDemo{
    public void method(person p){
        p.study();
    }
}
class student implements person{
    public void study(){
        System.out.println("gdysgfsksnfsk");
    }
}
public class mm {
    public static void main(String[] args) throws ParseException {
        personDemo pd=new personDemo();
        person p=new student();
        pd.method(p);
        // String s = "hello";
		// s += "world";
		// System.out.println(s);
        String s1 = new String("hello");
		String s2 = "hello";
        // * equal():默认比较的是地址值。String类重写了equals()方法，该方法的作用是比较字符串的内容是否相同
        // s1存储的是堆内存中的地址值，s2存储的是常量池中的地址值，所以s1 == s2为false；又由于String类的equals方法重写了toString，比较的是两个字符串的内容
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
        // BigInteger bi1 = new BigInteger("20");
		// BigInteger bi2 = new BigInteger("10");

		// // public BigInteger add(BigInteger val)
		// System.out.println("add:" + bi1.add(bi2));

		// // public BigInteger subtract(BigInteger val)
		// System.out.println("subtract:" + bi1.subtract(bi2));

		// // public BigInteger multiply(BigInteger val)
		// System.out.println("multiply:" + bi1.multiply(bi2));

		// // public BigInteger divide(BigInteger val)
		// System.out.println("divide:" + bi1.divide(bi2));

		// // public BigInteger[] divideAndRemainder(BigInteger val)
		// BigInteger[] bis = bi1.divideAndRemainder(bi2);
		// for (int x = 0; x < bis.length; x++) {
		// 	System.out.println(bis[x]);
		// }
//         BigInteger bi1 = new BigInteger("100");
// BigInteger bi2 = new BigInteger("50");

// System.out.println(bi1.add(bi2));
// System.out.println(bi1.subtract(bi2));
// System.out.println(bi1.multiply(bi2));
// System.out.println(bi1.divide(bi2));
// BigInteger[] b = bi1.divideAndRemainder(bi2);
// // divideAndRenmainder 对象为被除数而其内容当作除数，最后返回一个商与余数
// System.out.println(b[0]);
// System.out.println(b[1]);
// Date d = new Date();
// System.out.println("d:" + d);

// // try {
// // Thread.sleep(1000);
// // } catch (InterruptedException e) {
// // e.printStackTrace();
// // }

// long time = System.currentTimeMillis(); // 获取当前时间的毫秒值
// Date d2 = new Date(time);// 把毫秒值转换为日期表示
// System.out.println("d2:" + d2);

// Date d3 = new Date(3600000);
// // 3600000/1000/60/60 = 1个小时
// System.out.println("d3:" + d3);
// System.out.println("--------------------");

// Date d4 = new Date();
// // long t = d4.getTime();
// // long t2 = System.currentTimeMillis();
// // System.out.println(t);
// // System.out.println(t2);

// d4.setTime(36000000);
// System.out.println("d4:" + d4);
// Date d = new Date();
// 		// public SimpleDateFormat()
// 		// SimpleDateFormat sdf = new SimpleDateFormat();
// 		// SimpleDateFormat(String pattern)
// 		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
// 		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
// 		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
// 		// public final String format(Date date)
// 		String result = sdf.format(d);
// 		System.out.println(result);
// 		System.out.println("-------------------------------------------------");

// 		String s = "2008-08-08 12:23:34";
// 		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
// 		// public Date parse(String source)
// 		Date dd = sdf2.parse(s);
// 		System.out.println(dd);
	// 键盘录入你的出生年月日
    // Scanner sc = new Scanner(System.in);
    // System.out.println("请输入你的出生日期：(yyyy-mm-dd)");
    // String s = sc.nextLine();

    // // 把这个字符串转换为一个日期
    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
    // Date d = sdf.parse(s);

    // // 通过日期获取到一个毫秒值
    // long myTime = d.getTime();

    // // 获取当前时间的毫秒值
    // long time = System.currentTimeMillis();

    // // 用D-C得到一个毫秒值
    // long dateTime = time - myTime;

    // // 把得到的毫秒值计算成一个天即可
    // System.out.println(dateTime);
    // System.out.println("你来到这个世界已经：" + (dateTime / 1000 / 60 / 60 / 24)
    //         + "天了");
    Calendar c = Calendar.getInstance();
    System.out.println(c.get(Calendar.YEAR) + "---"
            + (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));
    c.add(Calendar.YEAR, -3);
    c.add(Calendar.MONTH, 2);
    c.add(Calendar.DATE, -12);
    System.out.println(c.get(Calendar.YEAR) + "---"
            + (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));

    // 重写给c对象赋值
    c.set(2012, 3, 4);
    System.out.println(c.get(Calendar.YEAR) + "---"
            + (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));
    		long start = System.currentTimeMillis();
		for (int x = 0; x < 1000000; x++) {
			System.out.println(x);
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时：" + (end - start) + "毫秒");       
    }
}
