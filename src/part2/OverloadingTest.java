package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        float v=Add(12.1f, 45.4f);
        System.out.println("v = " + v);
        int vv=Add(10,80);
        System.out.println("vv = " + vv);
    }
    public static int Add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static float Add(float a, float b){
        float sum=a+b;
        return sum;
    }
}
