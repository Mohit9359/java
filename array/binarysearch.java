public class binarysearch {
    public static int binarysearchh(int numbers[], int key){
       int start = 0;
       int end = numbers.length-1;
      while(start<=end){
        int mid = (start +  end) /2;
        if (numbers[mid]==key){
            return mid;
        } 
        else if(numbers[mid]<key){
          start = mid+1;
        }
        else{
          end = mid -1;
        }
      }
       return 0;

    }


    public static void main(String args[]){
      int arr[]={1,4,5,6,7,78};
      System.out.println(binarysearchh(arr, 7));
    }
    
}
