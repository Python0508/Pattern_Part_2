import java.util.*;
public class inverted_HalfPyramid_Numbers {
    public static void inverted_HalfPyramid_Numbers(int num){
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        inverted_HalfPyramid_Numbers(num);
    }
    
}
