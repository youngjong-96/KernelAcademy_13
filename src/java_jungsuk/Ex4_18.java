package src.java_jungsuk;

//구구단 출력
public class Ex4_18 {
    public static void main(String[] args) {
        for (int i=2;i<10;i++){
            for (int j=1;j<10;j++){
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println();
            }
        }
    }
}