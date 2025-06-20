package fc.java.privatestudy;

public class Star2 {
    public static void main(String[] args) {
        System.out.println("6.");
        for(int i=1;i<6;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("7.");
        for(int i=5;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("8.");
        String[][] arr8 =new String[5][9];
        for(int i = 0; i< arr8.length; i++){
            for(int j = 0; j< arr8[i].length; j++){
                if (i==0 && j==4){
                    arr8[i][j]="*";}
                else if (i==1 && j>2 && j<6){
                    arr8[i][j]="*";}
                else if (i==2 && j>1 && j<7){
                    arr8[i][j]="*";}
                else if (i==3 && j>0 && j<8){
                    arr8[i][j]="*";}
                else if (i==4){
                    arr8[i][j]="*";}
                else {
                    arr8[i][j]=" ";}
            }
        }
        for(int i = 0; i< arr8.length; i++){
            for(int j = 0; j< arr8[i].length; j++){
                System.out.print(arr8[i][j]);
            }
            System.out.println();
        }

        System.out.println("9.");
        String[][] arr9 =new String[5][5];
        for(int i = 0; i< arr9.length; i++){
            for(int j = 0; j< arr9[i].length; j++){
                if ((i==1 && j==0) || (i==1 && j==4)){arr9[i][j]=" ";}
                else if ((i==2 && j==0) || (i==2 && j==1) || (i==2 && j==3) || (i==2 && j==4)){arr9[i][j]=" ";}
                else if ((i==3 && j==0) || (i==3 && j==4)){arr9[i][j]=" ";}
                else {arr9[i][j]="*";}
                }
            }
        for(int i = 0; i< arr9.length; i++){
            for(int j = 0; j< arr9[i].length; j++){
                System.out.print(arr9[i][j]);
            }
            System.out.println();
        }

        System.out.println("10.");
        String[][] arr10 =new String[5][5];
        for(int i = 0; i< arr10.length; i++){
            for(int j = 0; j< arr10[i].length; j++){
                if ((i==0 && j==1) || (i==0 && j==2) || (i==0 && j==3)){arr10[i][j]=" ";}
                else if (i==1 && j==2){arr10[i][j]=" ";}
                else if (i==3 && j==2){arr10[i][j]=" ";}
                else if ((i==4 && j==1) || (i==4 && j==2) || (i==4 && j==3)){arr10[i][j]=" ";}
                else {arr10[i][j]="*";}
            }
        }
        for(int i = 0; i< arr10.length; i++){
            for(int j = 0; j< arr10[i].length; j++){
                System.out.print(arr10[i][j]);
            }
            System.out.println();
        }
    }
}
