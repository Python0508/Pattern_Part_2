import java.util.*;
public class diamond_Pattern {
    public static void diamond_Pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();  
        diamond_Pattern(num);
    }
    
}
