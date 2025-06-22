package src.java_jungsuk;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.printf("배열에 넣을 값을 입력하세요. (배열 개수: %d)> ",arr.length);
            String scan=scanner.nextLine();
            int num=Integer.parseInt(scan);
            arr[i]=num;
        }
        System.out.printf("입력된 배열의 값: %s", Arrays.toString(arr));
    }
}