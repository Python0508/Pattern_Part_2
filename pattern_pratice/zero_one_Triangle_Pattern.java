package Pratice_Questions.pattern_pratice;
import java.util.*;
public class zero_one_Triangle_Pattern {
    public static void zero_one_TrianglePattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        zero_one_TrianglePattern(num);
    }
    
}
