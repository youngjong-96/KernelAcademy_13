package src.java_jungsuk.part5;

import java.util.Scanner;

//총점, 평균 구하기
public class Ex5_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        float average=0;
        //점수 갯수 입력 받기
        System.out.print("총점과 평균을 계산할 점수의 갯수를 입력하세요(0~20억)> ");
        String counts=scanner.nextLine();
        int count=Integer.parseInt(counts);

        //점수값들 입력받기
        int[]score=new int[count];
        for(int i=0;i<score.length;i++){
            System.out.printf("계산할 점수를 입력하세요(정수)[%d]> ",i+1);
            String num=scanner.nextLine();
            score[i]=Integer.parseInt(num);
        }

        //총점과 평균 계산
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        average=(float)sum/score.length;    //정확한 평균 계산을 위해 float 형변환 주의!
        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);
    }
}
