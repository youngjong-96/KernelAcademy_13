package src.java_jungsuk.part5;

//배열을 길이를 2배 늘린 새로운 배열에 저장하기
public class Ex5_3 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        System.out.println("변경전");
        System.out.println("arr.length:"+ arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]:%d%n",i,arr[i]);
        }


        //새로운 배열 생성
        int[]arr2=new int[arr.length*2];
        //새로운 배열에 값 복사
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        //기존 배열이 새로운 배열의 주소를 가리키도록 하기
        arr=arr2;

        System.out.println("변경후");
        System.out.println("arr.length:"+arr.length);
        for(int i=0;i<arr2.length;i++){
            System.out.printf("arr[%d]:%d%n",i,arr[i]);
        }
    }
}
