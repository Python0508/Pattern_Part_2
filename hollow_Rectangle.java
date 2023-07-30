import java.util.*;
public class hollow_Rectangle{
    public static void hollow_Rectangle(int row, int cols ){
        // Rows print
        for(int i=1; i<=row; i++){
            //column
            for(int j=1; j<=cols; j++){
                if(i==1 || i==row || j==1 || j==cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int rowNum = sc.nextInt();
        System.out.print("Enter column number: ");
        int colNum = sc.nextInt();
        hollow_Rectangle(rowNum, colNum);
    }
}