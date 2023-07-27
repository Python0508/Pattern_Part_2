import java.util.*;
public class butterfy_Pattern {
    public static void butterfy_Pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(num-i)*2; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(num-i)*2; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the number: ");
        int num = sc.nextInt();
        butterfy_Pattern(num);
    }
    
}
