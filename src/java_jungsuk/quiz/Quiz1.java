package src.java_jungsuk.quiz;

import java.util.Arrays;
import java.util.Scanner;

//[야구게임]1~9로 중복 없이 된 3자리수 2개를 비교해서 "(같은 위치 같은 숫자)S(다른 위치 같은 숫자)B" 형식으로 출력
//맞출때까지(3S0B) 반복하기
public class Quiz1 {
    public static void main(String[] args) {
        int s=0, b=0;
        Scanner scanner=new Scanner(System.in);

        //arr를 랜덤으로 중복없이 생성하기
        int[]arr=new int[3];
        int i = 0;
        while (i < 3) {
            int num = (int)(Math.random() * 9 + 1);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[i] = num;
                i++;
            }
        }
        System.out.println("arr="+Arrays.toString(arr));

        //arr2를 사용자가 입력하도록 하기
        do{
            int[]arr2=new int[3];
            System.out.print("게임에 사용할 숫자를 입력하세요(3개)> ");
            for(int k = 0; k <arr2.length; k++) {
                String number=scanner.nextLine();
                arr2[k]=Integer.parseInt(number);
            }
            System.out.println("arr="+Arrays.toString(arr2));

            s=0;
            b=0;

            //3자리 수 2개를 비교해서 같은 위치 같은 숫자, 다른 위치 같은 숫자 세기
            for(int t = 0; t <arr.length; t++){
                for(int j=0;j<arr2.length;j++){
                    if(t ==j && arr[t]==arr2[j]){
                        s++;
                    }
                    if(t !=j && arr[t]==arr2[j]){
                        b++;
                    }
                }
            }

            //비교 결과 출력
            System.out.println(s+"s"+b+"b");

        }while(!((s==3)&&(b==0)));
    }
}