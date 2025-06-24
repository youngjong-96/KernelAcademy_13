package src.java_jungsuk.part5;

import java.util.Arrays;

public class Ex5_0 {
    public static void main(String[] args) {
        //가능
        int[]arr=new int[5];
        //가능
        int[]arr2={1,2,3};
        //아래처럼 나눠서 적는건 불가능
        //int[]arr2;
        //arr2={1,2,3,4,5};
        //선언과 초기화를 나누려면 아래와 같이 해야함(but. 이런 경우 매우 드물다)
        int[]arr3;
        arr3=new int[]{1,2,3};

        //배열 출력 시 println 기능으로 char타입 배열은 배열값을 바로 출력 가능
        int[]arr4={1,2,3};
        char[]arr5={'a','b','c'};
        System.out.println(arr4);  //주소값 출력 ([I@f6f4d33)
        System.out.println(arr5);  //배열값을 그대로 출력 (abc)
        System.out.println(Arrays.toString(arr4));  //Arrays.toString() 매서드를 이용하면 출력가능 ([1, 2, 3])
    }
}