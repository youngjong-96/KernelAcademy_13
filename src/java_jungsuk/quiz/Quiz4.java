package src.java_jungsuk.quiz;

public class Quiz4 {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = new Card();
        d.shuffle();
    }
}

class Deck{
    final int CARD_NUM=52;
    Card cardArr[]=new Card[CARD_NUM];

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

    //rankcheck매서드: 5개의 카드를 받아서 메이드를 판단한다.
    //1. 5개의 카드를 pick()매서드를 이용해서 뽑음
    //2.
    //String rankcheck(Card[] ){

    //}
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
        return "kind: "+kinds[this.kind]+", number: "+number.charAt(this.number);
    }
}