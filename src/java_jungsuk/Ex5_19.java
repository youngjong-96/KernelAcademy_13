package src.java_jungsuk;

//학생, 과목 별 총점 및 평균 출력
public class Ex5_19 {
    public static void main(String[] args) {
        int[][]score={
                {100,100,100},
                {90,90,90},
                {70,70,70},
                {50,50,50},
                {30,30,30}
        };
        int korTotal=0, engtotal=0, mathtotal=0;

        System.out.println("번호  국어  영어  수학  총점  평균  ");
        System.out.println("======================================");

        for(int i=0;i<score.length;i++){
            int sum=0;
            float average=0.0f;

            korTotal+=score[i][0];
            engtotal+=score[i][1];
            mathtotal+=score[i][2];
            System.out.printf("%3d",i+1);

            for(int j=0;j<score[i].length;j++){
                sum+=score[i][j];
                System.out.printf("%5d",score[i][j]);
            }

            average=(float)sum/score[i].length;
            System.out.printf("%5d %5.1f %n",sum,average);
        }
        System.out.println("======================================");
        System.out.printf("총점: %3d %4d %4d%n",korTotal,engtotal,mathtotal);
    }
}
