package src.java_jungsuk.part4;

import java.util.Scanner;

//사용자로부터 더할 숫자를 입력받아서 종료(0입력)할 때까지 계속 진행
public class Ex4_27 {
    public static void main(String[] args) {
        int num;
        int sum=0;
        boolean end=true;

        Scanner scanner=new Scanner(System.in);
        System.out.println("더할 숫자를 입력하세요(종료하려면 0입력): ");

        while(end)
        {
            System.out.print(">>");
            String v=scanner.nextLine();
            num=Integer.parseInt(v);

            if (num!=0)
            {
                sum+=num;
                System.out.println("누적합계: "+sum);
            }else
            {
                end=false;
                System.out.println("종료");
            }
        }
        System.out.println("최종합계: "+sum);
    }
}
