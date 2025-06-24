package src.java_jungsuk.part5;

import java.util.Arrays;

//정렬하기 (버블정렬)
public class Ex5_10 {
    public static void main(String[] args) {
        //0~9까지 랜덤으로 10개를 가지는 배열 생성 후 초기화
        int[]arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));

        //정렬하기
        for(int i=0;i<arr.length-1;i++){
            boolean changed=false; //자리변경 여부 확인
            for(int j=0;j<arr.length-1-i;j++){
                //왼쪽 숫자가 오른쪽보다 크면 자리 바꿈
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    changed=true;
                }
            }
            if(!changed){break;}  //더이상 자리바꿈이 없으면 정렬 멈춤
            System.out.println(Arrays.toString(arr));
        }
    }
}