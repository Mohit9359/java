package CONDITIONAL;
import java.util.Scanner;
public class largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if(a>b){
            if(a>c){
                largest = a;
                System.out.println(largest + " is the largest of all!");
            }
        }
else if(b>a){
    if(b>c){
        System.out.println("b is the largest of all");
    }
    else {
        System.out.println("c is the largest of all");
    }
}


sc.close();
    }

    
}
