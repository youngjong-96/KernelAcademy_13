package src.java_jungsuk;

//빈도수세기 +중복제거 +정렬
public class Ex5_11_2 {
    public static void main(String[] args) {
        int[] numArr=new int[10]; //임의의 숫자 10개를 저장하기 위한 배열
        int[] counter=new int[10];  //10개의 숫자를 세기 위한 배열

        //임의의 숫자 10개를 생성해서 numArr배열에 저장 후 출력
        for(int i=0;i<numArr.length;i++){
            numArr[i]=(int)(Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        //배열에 있는 숫자들을 꺼내서 숫자세는 배열에 하나씩 세기
        for(int i=0;i<numArr.length;i++){
            counter[numArr[i]]++;
        }

        //counter배열 안에 있는 숫자들 출력해서 numArr배열에 있는 숫자 세기
//        for(int i=0; i<numArr.length; i++){
//            System.out.println(i +"의 개수: "+counter[i]);
//        }

        //중복제거1
        //counter[i]가 0이 아닌것들을 출력
        System.out.print("중복제거1:");
        for(int i=0;i<numArr.length;i++){
            if(counter[i]!=0){
                System.out.print(i);
            }
        }//for문의 끝

        //중복제거2
        System.out.println();
        System.out.print("중복제거2:");
        //중복제거 여부 배열 생성해서 true로 초기화
        boolean check[]=new boolean[10];
        for (int i=0;i<check.length;i++){
            check[i]=true;
        }
        //numArr[i]를 뒤에서부터 자기를 제외하고 앞에서부터 비교해서 같은 값이 있으면 배열에 false를 저장
        for (int i=numArr.length;i>=0;i--){
            for (int j=0;j<(i-1);j++){
                if (numArr[i-1]==numArr[j])
                {
                    check[i-1]=false;
                    break;
                }
            }
        }
        //중복여부 배열에서 true로 된 값을 원래 배열에서 출력
        for (int i=0;i<numArr.length;i++){
            if (check[i]==true){
                System.out.print(numArr[i]);
            }
        }

        //정렬
        //numArr[i]와 numArr[i+1]을 비교해서 크면 자리를 바꾼다 <-를 계속 반복  ;;이거 너무 어렵네 => 이게 정렬 알고리즘이구나ㅋ.ㅋ
        //counter[i]가 0이 아닌것들을 출력하는데 1개면 1개, 2개면 2개, 3개면 3개를 출력한다.
        System.out.println();
        System.out.print("정렬: ");
        for(int i=0;i<numArr.length;i++){
            if(counter[i]!=0)
            {
                int a=i;
                for(int j=0;j<counter[i];j++){
                    System.out.print(a);
                }
            }
        }//for문의 끝
    }//main의 끝
}