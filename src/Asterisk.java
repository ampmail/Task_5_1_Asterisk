public class Asterisk {
    static final int NUM_OF_ROW = 5;

    public static void main (String[] args){
        for (int i=NUM_OF_ROW-1; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=(NUM_OF_ROW-i)*2-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
