import java.util.Scanner;
public class base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        array[0]=sc.nextInt();
        System.out.println(array[0]);

        System.out.println(array.length);//prints the lenght of the array
        sc.close();
        }
        
    
}
