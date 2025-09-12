package sorting;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt{
public static void printarr(Integer array[]){
    for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

} 
    public static void main(String[] args) {
        Integer array[]={5,7,1,4,8,3,5,9};
        // Arrays.sort(array);
        // printarr(array);
        Arrays.sort(array,Collections.reverseOrder());
        printarr(array);
        
    }
    
}
