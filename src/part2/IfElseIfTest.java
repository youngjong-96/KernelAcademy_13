package fc.java.part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        //90점 이상은 A반, 85점 이상은 B반, 80점 이상은 C반, 80점 미만은 불합격 처리
        int[]score=new int[5];
        for(int i=0;i<score.length;i++){
            System.out.print("점수를 입력하세요(5개)");
            score[i]=scan.nextInt();
            if(score[i]>=90){
                System.out.println("A반");
            } else if (score[i]>=85) {
                System.out.println("B반");
            } else if (score[i]>=80) {
                System.out.println("C반");
            }else {
                System.out.println("불합격");
            }
        }
    }
}
