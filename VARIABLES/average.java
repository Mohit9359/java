package VARIABLES;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int avg= (A + B + C)/ 3 ;
        
        System.out.println("The average is"+avg);
        
        
 
sc.close();   }
    
}
