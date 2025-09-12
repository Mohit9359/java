package WHILE;
import java.util.Scanner;
public class natural_sum {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a =  1;
    int sum=0;
    int b = sc.nextInt();
    
    while(a<=b){
        sum = sum + a ;
        a++;
          }


    System.out.println(sum);


    sc.close();
    }
    
}
