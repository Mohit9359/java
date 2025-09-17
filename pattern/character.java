package Pattern;
import java.util.Scanner;
public class character {
    public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.println("enter the value");
    int a = sc.nextInt();
    char ch='A';
    for (int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    
    
    

sc.close();

    
}
}