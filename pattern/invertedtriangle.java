package pattern;
import java.util.Scanner;
public class invertedtriangle {
    public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.println("enter the value");
    int a = sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=a;j>=i;j--){
            System.out.print("*");
        }
    System.out.println();


    }


sc.close();

    
}
}