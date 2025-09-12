package leetcode;
import java.util.*;
public class problem1  {
    public static void subarrays(int numbers[],int target){
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];
            for(int j =i+1;j<numbers.length;j++){
                if(current+numbers[j]==target){
                    System.out.println(i+","+j);
                }
            }

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[]={1,8,5,6,8,3};
        System.out.println("tell the target:");
        int target = sc.nextInt();
        subarrays(numbers,target);

    }
    
}
