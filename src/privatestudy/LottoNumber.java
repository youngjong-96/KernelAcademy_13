package src.privatestudy;
import java.util.Arrays;

public class LottoNumber {
        public static void main(String[] args) {
            int []lotto =new int[6];
            int count=0;
            System.out.print("생성된 숫자는: ");

            while(count<6) {
                boolean jungbok=false;
                int num = (int)((Math.random() * 45) + 1);
                System.out.print(num);
                //생성된 수가 중복이면 패스
                check: for(int i=0;i<count;i++) {
                    if (num == lotto[i]) {
                        jungbok = true;
                        break check;
                    }
                }
                //생성된 수가 중복이 아니면 배열에 넣음
                if(!jungbok){
                    lotto[count]=num;
                    count++;
                    System.out.print("\""+lotto[count-1]+"\"");
                }
            }
            Arrays.sort(lotto); //완성된 배열 정렬
            System.out.println();  //줄바꿈
            //최종 번호 출력
            System.out.print("최종 선정된 번호는: ");
            for(int i=0;i<lotto.length;i++){
                System.out.print(lotto[i]+", ");
            }
        }
}
