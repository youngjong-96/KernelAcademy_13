package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        //구구단 출력하기
        int []a={1,2,3,4,5,6,7,8,9};
        int []b={1,2,3,4,5,6,7,8,9};

        for(int i:a){
            for(int j:b){
                System.out.print(j+"x"+i+"="+i*j+" ");
            }
            System.out.println();
        }

        //배열 원소를 순서대로 출력하기
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+"\t");
        }

        System.out.println("");

        for(int i:numbers){
            System.out.print(i+"\t");
        }


        //알파벳 대문자와 아스키 코드 값을 출력하기
        for(char c='A';c<='Z';c++){
            System.out.println(c+":"+(int)c);
        }
    }
}


