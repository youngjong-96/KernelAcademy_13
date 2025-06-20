package fc.java.privatestudy;

public class Star1 {
    public static void main(String[] args) {
        System.out.println("1.");
        for(int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("2.");
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();

        System.out.println("3.");
        for(int i=4;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();

        System.out.println("4.");
        String[][] arr =new String[5][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (i==j){
                    arr[i][j]="*";
                } else if (i+j==4) {
                    arr[i][j]="*";
                } else {
                    arr[i][j]=" ";
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("5.");
        for(int i=1;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}






