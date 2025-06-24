package src.java_jungsuk.part4;

public class Ex4_21 {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if (i==j){
                    System.out.printf("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
