import java.util.*;
public class floyds_Triangle {
    public static void floyds_Triangle(int num){
        int number = 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        floyds_Triangle(num);
    }
    
}
