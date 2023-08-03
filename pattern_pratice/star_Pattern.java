package Pratice_Questions.pattern_pratice;
import java.util.*;
public class star_Pattern {
    public static void starPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        starPattern(num);
    }
    
}
