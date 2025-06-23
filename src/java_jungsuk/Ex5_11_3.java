package src.java_jungsuk;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//숫자가 아닌 char형이나 String인 배령인 경우에는 빈도수를 어떻게 세지???
//1. 고유값만을 가지는 배열을 만들고 2. 원래 배열과 새로운 배열을 비교해서 개수를 세서 counter배열(새로운 배열과 같은 길이)에 저장해서 출력
public class Ex5_11_3 {
    public static void main(String[] args) {
        String[]arr={"hi","Hi","hi","HI","hi","hi","HI","hI","hI","hI"};
        for(String str:arr){System.out.printf("%s,",str);}
        System.out.println();

        //고유값을 가지는 uniqueArr배열 만들기
        // 중복 제거 및 순서 유지
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        // Set → 새로운 배열
        String[] uniqueArr = set.toArray(new String[0]);
        // 출력
        System.out.println("고유값 배열: " + Arrays.toString(uniqueArr));

        //arr배열과 uniqueArr배열을 비교해서 counter 배열에 숫자 세기
        int[]counter=new int[uniqueArr.length];

        for(int i=0;i<uniqueArr.length;i++){
            for(int j=0;j<arr.length;j++)
                if(uniqueArr[i].equals(arr[j])){
                    counter[i]++;
            }
        }

        //결과 출력
        for(int i=0;i<uniqueArr.length;i++){
            System.out.printf("%s의 개수:%d%n",uniqueArr[i],counter[i]);
        }
    }
}