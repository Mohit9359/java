import java.util.*;
public class percentage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[]= new int[10];
        System.out.println("ENTER MARKS OF PHYSICS:");
         marks[0]= sc.nextInt();
         
        System.out.println("ENTER MARKS OF CHEMISTRY:");
         marks[1]=sc.nextInt();
         
        System.out.println("ENTER MARKS OF PHYSICS:");
         marks[2]=sc.nextInt();

        int  PERCENTAGE=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("the given percentage is:"+PERCENTAGE+"%");


     sc.close();
    }

}
