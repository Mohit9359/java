public class reversearray {
    public static void reverse(int array[]){
        int start = 0;
        int end = array.length-1;
         while(start<end){
            int temp = array[end];
             array[end]= array[start];
             array[start]= temp;
             start++;
             end--;
         }
         

    }
    public static void main(String[] args) {
        int array[]={4,5,8,9,12,54,89};
        
        reverse(array);
        for(int i=0;i<array.length;i++){ 
            System.out.println(array[i]);
        }
    }
    
}
