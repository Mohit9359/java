package CollegeCodes;

import java.util.Scanner;

public class stringvalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

         if (input.contains("&") && input.contains("#") && input.length() % 2 == 0) {
            System.out.println("yes");
        } 
        else {
            System.out.println("no");
        }
   sc.close(); }
    }



