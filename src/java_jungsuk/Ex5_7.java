package src.java_jungsuk;

import java.util.Arrays;

//랜덤으로 섞기
public class Ex5_7 {
    public static void main(String[] args) {
        //0~9까지 배열 생성
        int[]arr={0,1,2,3,4,5,6,7,8,9};
        int trynum=100;
        System.out.println("arr="+ Arrays.toString(arr));

        //0~9까지 임의의 수 생성해서 arr[0]번째와 n번째 수를 trynum만큼 계속 섞기
        for(int i=0;i<trynum;i++){
            int n=(int)(Math.random()*10);
            int tmp=arr[0];
            arr[0]=arr[n];
            arr[n]=tmp;
        }

        System.out.println("arr="+ Arrays.toString(arr));
    }
}
