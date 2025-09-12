package FOR;
import java.util.Scanner;
public class hello {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times you want to print hello world");
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.println("****");

        }




sc.close();



    }
    
}
