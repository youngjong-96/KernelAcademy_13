package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int result=ArrayAdd(a);
        System.out.println("result = " + result);
    }
    public static int ArrayAdd(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
