package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        int max=Maxvalue(7,9);
        System.out.println("max = " + max);
        int min=minValue(5,3);
        System.out.println("min = " + min);
    }
    public static int Maxvalue(int a, int b){
        return (a>b)?a:b;
    }
    public static int minValue(int a, int b){
        return (a>b)?b:a;
    }
}
