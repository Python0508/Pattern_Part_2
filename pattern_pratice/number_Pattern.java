package Pratice_Questions.pattern_pratice;
import java.util.*;
public class number_Pattern {
    public static void numberPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        numberPattern(num);
    }
    
}
