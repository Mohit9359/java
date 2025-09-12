package CONDITIONAL;
import java.util.Scanner;
public class evenorodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to be checked :");
        int a = sc.nextInt();
        if( a%2==0){
            System.out.println("the given number is even");
}
else{
    System.out.println("the given number is odd");
}





sc.close();
    }
    
}
