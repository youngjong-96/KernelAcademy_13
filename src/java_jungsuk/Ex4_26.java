package src.java_jungsuk;

//1부터 몇까지 더해가면 100보다 작은 수가 나오는지 계산
public class Ex4_26 {
    public static void main(String[] args) {
        int sum=0, i=0;

        while((sum+=i++)<=100)
        {
            System.out.printf("%d - %d\n",i,sum);
        }
        System.out.println();

        //1부터 3씩 증가하는 수로 몇까지 더하면 100보다 작은 수가 나오는지 계산
        int sum1=0, i1=0;
        while(sum1<=100)
        {
            sum1+=(i1+=3);
            System.out.printf("%d - %d\n",i1,sum1);
        }
    }
}