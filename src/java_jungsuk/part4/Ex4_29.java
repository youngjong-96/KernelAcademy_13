package src.java_jungsuk.part4;

//369게임
public class Ex4_29 {
    public static void main(String[] args) {
        int num;
        for(int i=1;i<=100;i++)
        {
            System.out.printf("i = %d",i);
            num=i;
            do {
                if((num%10%3==0)&&(num%10!=0))
                {
                    System.out.print("짝");
                }
            }while((num/=10)!=0);
            System.out.println();
        }//for문의 끝
    }
}
