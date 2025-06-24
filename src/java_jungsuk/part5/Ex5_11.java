package src.java_jungsuk.part5;

import java.util.Arrays;

//빈도 구하기
public class Ex5_11 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        int[]counter=new int[arr.length];

        //arr에 0~9까지 임의의 수 10개 초기화
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //임의로 생성된 배열값을 확인해서 counter 배열을 이용해 갯수 세기
        for(int i=0;i<arr.length;i++){
            counter[arr[i]]++;
        }

        //결과 출력
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d의 개수:%d%n",i,counter[i]);
        }
    }
}
