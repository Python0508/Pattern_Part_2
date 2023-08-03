package Pratice_Questions.pattern_pratice;
import java.util.*;
public class hollow_Pattern {
    public static void hollowPattern(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || j==1 || i==rows || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols: ");
        int cols = sc.nextInt();
        hollowPattern(rows, cols);
    }
    
}
