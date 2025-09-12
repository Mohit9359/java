package CONDITIONAL;
import java.util.Scanner;
public class fever {
    public static void main(String args[]){
        System.out.println("Enter the reading of thermometer");
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble();
        if(a<=100){
            System.out.println("you are normal");
        }
        else{
            System.out.println("you have fever");
        }

sc.close();
    } 

}
