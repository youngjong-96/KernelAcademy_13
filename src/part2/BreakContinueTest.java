package fc.java.part2;

import java.util.Scanner;

public class BreakContinueTest {
    public static void main(String[] args) {
        //문자 'o'를 만나면 중단하기
        char[] c={'s','h','u','t','d','o','w','n'};
        for(char a:c){
            if (a=='o')break;
            System.out.print(a + "\t");
        }
        System.out.println();

        //1부터 임의의 수까지 중 3의 배수의 개수를 구하기
        Scanner scan=new Scanner(System.in);
        System.out.println("임의의 정수를 입력하세요: ");
        int num=scan.nextInt();

        int count=0;
        int i;
        for(i=1;i<=num;i++) {
            if(i%3==0){
                count++;
            }
            continue;
        }
        System.out.println("1부터"+(i-1)+"까지의 3의 배수의 갯수는: "+count);
    }
}