package src.java_jungsuk.quiz;

public class Quiz4 {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = new Card();
        d.shuffle();
        d.choose(5);
        d.showDeck();
        System.out.println();
        d.init();
        d.CountDeck();
    }
}

class Deck{
    int[]countKind=new int[Card.KIND_MAX];
    int[]countNumber=new int[Card.NUM_MAX];
    final int CARD_NUM=52;
    Card cardArr[]=new Card[CARD_NUM];
    Card chooseArr[]=new Card[5];

    //Deck 초기화 매서드: 덱의 카드를 초기화 cardArr 배열에 모든 카드를 넣는다
    Deck(){
        int i=0;
        for(int k=Card.KIND_MAX;k>0;k--){
            for(int n=0;n<Card.NUM_MAX;n++){
                cardArr[i++]=new Card(k,n+1);
            }
        }
    }
    //pick 매서드: 입력한 위치에 있는 카드를 반환
    Card pick(int index){
        return cardArr[index];
    }
    //pick 매서드 오버로딩: 입력값 없이 하면 랜덤으로 한 장 뽑음
    Card pick(){
        int index=(int)(Math.random()*CARD_NUM); //0~51까지 임의의 순서 생성
        return pick(index);
    }
    //shuffle 매서드: 카드 배열 안에 위치를 이용해서 카드를 랜덤으로 섞는다
    void shuffle(){
        for(int i=0;i< cardArr.length;i++){
            int r=(int)(Math.random()*CARD_NUM);

            Card temp=cardArr[i];
            cardArr[i]=cardArr[r];
            cardArr[r]=temp;
        }
    }
    //choose 매서드: 5개의 카드를 앞에서부터 뽑아서 chooseArr 배열에 저장
    void choose(int num){
        for(int i=0;i<num;i++){
            chooseArr[i]=cardArr[i];
        }
    }
    //CountDeck 매서드:선택한 덱 안에 모양 별, 숫자 별 갯수를 센다
    void CountDeck(){
        for(int i=0;i<chooseArr.length;i++) {
            for (int j=0;j<Card.KIND_MAX; j++) {
                if (chooseArr[i].kind == j+1) {
                    countKind[j]++;
                }
            }
        }
        for(int i=0;i<chooseArr.length;i++) {
            for (int j=0;j<Card.NUM_MAX; j++) {
                if (chooseArr[i].number == j+1) {
                    countNumber[j]++;
                }
            }
        }
        for(int i=0;i<Card.KIND_MAX;i++){
            System.out.printf("모양%d의 갯수는=%d%n",i+1,countKind[i]);
        }
        System.out.println();
        for(int i=0;i<Card.NUM_MAX;i++){
            System.out.printf("숫자%d의 갯수는=%d%n",i+1,countNumber[i]);
        }
    }
    //init 매서드: 갯수 센거 초기화
    void init(){
        for(int i=0;i<countKind.length;i++){
            countKind[i]=0;
        }
        for(int i=0;i< countNumber.length;i++){
            countNumber[i]=0;
        }
    }
    //showDeck 매서드: 뽑은 카드의 결과를 보여줌
    void showDeck(){
        for(int i=0;i<chooseArr.length;i++){
            System.out.printf("[%d,%d]%n",chooseArr[i].kind, chooseArr[i].number);
        }
    }
}

class Card{
    static final int KIND_MAX=4;    //공통 고정 속성
    static final int NUM_MAX=13;

    static final int SPADE=4;
    static final int DIAMOND=3;
    static final int HEART=2;
    static final int CLOVER=1;

    int kind;  //개별속성 iv
    int number;


    //카드 기본값 스페이드 1로 초기화
    Card(){
        this(SPADE, 1);
    }

    //카드 종류와 숫자를 받는 경우 초기화
    Card(int kind, int number){
        this.kind=kind;
        this.number=number;
    }

    //toString 매서드: 카드의 종류와 숫자를 출력
    public String toString(){
        String[] kinds={"","CLOVER","HEART","DIAMOND","SPADE"};
        String number="0123456789XJQK";
        return kinds[this.kind]+", "+number.charAt(this.number);
    }
}
/*
    (1)모양이 모두 같고 숫자가 일렬로 되어 있으면 "Straight Flush"
    (2)숫자 4개가 같으면 "Four Card"
    (3)숫자 3개가 같고 나머지 2개가 같으면 "Full House"
    (4)모양이 모두 같으면 "Flush"
    (5)숫자가 모두 연속되면 "Straight"
    (6)숫자 세 개가 같으면 "Three Card"
    (7)숫자 2개가 같고 또 다른 숫자 2개가 같으면 "Two Pair"
    (8)숫자 2개가 같으면 Pair
    (9)위의 조건들에 아무것도 해당되는게 없으면 가장 높은게 "High Card"
    */