package src.java_jungsuk.part6;

public class Ex6_15 {
    public static void main(String[] args) {
        int num=5;
        int result=factorial(num);
        System.out.printf("%d!=%d",num,result);
    }
    static int factorial(int num){
        int sum=0;
        if(num==1){
            sum=1;
        } else{
            sum=num*factorial(num-1);
        }
        return sum;
    }
}