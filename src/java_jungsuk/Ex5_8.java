package src.java_jungsuk;

//로또번호 만들기
public class Ex5_8 {
    public static void main(String[] args) {
        //1~45번호가 있는 배열 만들기
        int[]arr=new int[45];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        //배열을 무작위로 섞고 무작위로 6개 뽑기
        int j=0;  //무작위 수 저장
//        int tmp=0;   //자리바꿀 때 임시변수
//        int trynum=100;  //섞을 횟수
//
//        for(int i=0;i<trynum;i++){
//            j=(int)((Math.random()*44)+1); //0~44 중 무작위 수 생성
//            //arr[0]와 arr[j] 자리 바꾸기
//            tmp=arr[0];
//            arr[0]=arr[j];
//            arr[j]=tmp;
//        }

        for(int i=0;i<6;i++){
            j=(int)((Math.random()*44)+1); //0~44 중 무작위 수 생성
            System.out.printf("%d번 공=%d%n",i+1,arr[j]);
        }
    }
}