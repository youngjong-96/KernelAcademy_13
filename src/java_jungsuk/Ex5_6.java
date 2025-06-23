package src.java_jungsuk;

import java.util.Scanner;

//최대값 최소값 구하기
public class Ex5_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        float average=0;
        //점수 갯수 입력 받기
        System.out.print("최대값과 최소값을 계산할 점수의 갯수를 입력하세요(0~20억)> ");
        String counts=scanner.nextLine();
        int count=Integer.parseInt(counts);

        //점수값들 입력받기
        int[]score=new int[count];
        for(int i=0;i<score.length;i++){
            System.out.printf("숫자들을 입력하세요(정수)[%d]> ",i+1);
            String num=scanner.nextLine();
            score[i]=Integer.parseInt(num);
        }

        //최대값 최소값 계산
        int max=score[0], min=score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            } else if (score[i]<min) {
                min=score[i];
            }
        }
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);
    }
}
