import java.util.Scanner;
public class SUMM {
    public static void sumii(int a,int b){
        int summm = a+b;
        System.out.println(summm);
   
        
    }
    public static void main(String args[]){
         Scanner sc =  new Scanner(System.in);
         System.out.println("enter first value:");
        int a = sc.nextInt();
        System.out.println("enter 2nd value:");
        int b = sc.nextInt();
        sumii( a, b);
        sc.close();
    }
    
}
