package collegecodes;
import java.util.Scanner;
public class divideby2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    float a = sc.nextFloat();
    float b = a/2;
    String y=String.format("%.1f", b);
    float x=Float.parseFloat(y);
    System.out.println(x);


    sc.close();
    
}
    
}
