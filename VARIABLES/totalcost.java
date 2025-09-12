package VARIABLES;
import java.util.Scanner;
public class totalcost {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter cost of pencil");
    float pencil = sc.nextInt();
    System.out.println("enter cost of pen");
    float pen = sc.nextInt();
    System.out.println("enter cost of eraser");
    float eraser = sc.nextInt();
    float sum = (pencil + pen + eraser);
    float gst=0.18f * sum;
    float totalbill = (sum+gst);
    System.out.println("the total bill is :"+ totalbill);

  
sc.close();  }

    
}
