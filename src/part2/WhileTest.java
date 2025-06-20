package fc.java.part2;

public class WhileTest {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        int a=0;

        while(a<numbers.length){
            System.out.print(numbers[a]+"\t");
            a++;
        }
        System.out.println("");
        a=0;

        do{
            System.out.print(numbers[a]+"\t");
            a++;
        }while(a<numbers.length);
    }
}
