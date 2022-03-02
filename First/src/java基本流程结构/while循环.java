package java基本流程结构;

public class while循环 {
    public static void main(String[] args) {
        int zf=8844430;
        int count=0;
        double paper=0.1;
        while(paper<=zf){
            paper*=2;
            count++;
        }
        System.out.println("折叠了"+count+"次");
    }
}
