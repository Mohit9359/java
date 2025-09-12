import java.util.Scanner;
public class sum {
    public static   int summision( int num1 , int num2){
        int summ =  (num1 + num2);
        System.out.println(summ);
        return summ;
        
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        summision(a, b);
                sc.close();
        

    }
    
}
