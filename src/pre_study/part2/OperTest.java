package fc.java.part2;

import java.util.Scanner;

public class OperTest {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a); // a=9 계산 후 9 출력
        System.out.println(a++); // 9 출력 후 a=10
        System.out.println(a--); // 10 출력 후 a=9
        System.out.println(++a); // a=10 계산 후 10 출력
        System.out.println(a);   // a=10

        Scanner scan=new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int b=scan.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int c=scan.nextInt();
        int Max=(b<c)?c:b;
        int Min=(b<c)?b:c;
        System.out.println("Max = " + Max);
        System.out.println("Min = " + Min);

        System.out.println("네자리수의 정수를 입력하세요: ");
        int digit=scan.nextInt();

        System.out.println("천의자리수는: "+ digit/1000%10);
        System.out.println("백의자리수는: "+ digit/100%10);
        System.out.println("십의자리수는: "+ digit/10%10);
        System.out.println("일의자리수는: "+ digit%10);


        int test=5;
        test+=1;  //6
        System.out.println("test = " + test);
        test-=1;  //5
        System.out.println("test = " + test);
        test*=2;  //10
        System.out.println("test = " + test);
        test/=2;  //5
        System.out.println("test = " + test);
        test%=2;  //1
        System.out.println("test = " + test);
    }
}
