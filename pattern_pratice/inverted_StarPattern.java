package Pratice_Questions.pattern_pratice;
import java.util.*;
public class inverted_StarPattern {
    public static void inverted_StarPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        inverted_StarPattern(num); 
    }
    
}
