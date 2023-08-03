package Pratice_Questions.pattern_pratice;
import java.util.*;
public class hollow_Rhombus_Pattern {
    public static void hollow_RhombusPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                if(i==1 || j==1 || i==num || j==num){
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
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        hollow_RhombusPattern(num);
    }
    
}
