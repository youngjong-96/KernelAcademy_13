package src.java_jungsuk.part6;

import java.util.Arrays;

class Ex6_12{
    public static void main(String[] args) {
        int[]arr={3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr));
    }

    static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    static void sortArr(int[] arr){
        Arrays.sort(arr);
    }

    static int sumArr(int[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result;
    }
}