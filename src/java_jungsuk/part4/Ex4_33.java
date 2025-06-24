package src.java_jungsuk.part4;

//break, continue 예제
public class Ex4_33 {
    public static void main(String[] args) {
        lp1:for (int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                if((1<=j)&&(j<=5)){
                    //break lp1;  //참인 값을 만나면 해당되는 반복문을 나감
                    //break;      //참인 값을 만나면 반복문을 나감
                    continue;     //해당하는 것만 반복에서 제외됨
                }
                System.out.printf("%dx%d=%d\n",i,j,i*j);
            }//for문의 끝
            System.out.println();
        }//lp1의 끝
    }
}
