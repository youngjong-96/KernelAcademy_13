package src.java_jungsuk;

//1부터 몇까지 더해야 100보다 커지는지
public class Ex4_30 {
    public static void main(String[] args) {
        int sum=0, num=0;

        while(true)
        {
            if (sum>100){
                break;
            }
            num++;
            sum+=num;
        }//while문의 끝
        System.out.printf("num=%d sum=%d",num,sum);
    }
}
