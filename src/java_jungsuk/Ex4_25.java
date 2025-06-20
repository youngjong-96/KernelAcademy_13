package src.java_jungsuk;

import java.util.Scanner;

//각 자리수 합 구하기
public class Ex4_25 {
    public static void main(String[] args) {
        int num=0, sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("숫자를 입력하세요(ex.134567)> ");
        String tmp= scanner.nextLine();
        num=Integer.parseInt(tmp);

        while(num!=0)
        {
            sum+=num%10;
            System.out.printf("입력한 숫자는: %d, 현재까지 자릿수 합: %d\n",num,sum);
            num/=10;
        }
        System.out.println("최종 자리수의 합: "+sum);
    }
}
