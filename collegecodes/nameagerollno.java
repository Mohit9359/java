package CollegeCodes;
import java.util.Scanner;
public class nameagerollno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String a = sc.nextLine();
        System.out.println("enter age");
        int b = sc.nextInt();
        System.out.println("enter roll no:");
        int c = sc.nextInt();
        System.out.println("Your name is :"+a);
        System.out.println("Your age is :"+b);
        System.out.println("Your roll no is :"+c);

    


      sc.close();

    }
    
}
