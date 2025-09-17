package Self_practice ;

public class binsearch {
    public static int binarysearch(int numbers[],int key){
        int start =0;
        int end = numbers.length-1;
        while(end>=start){ 
            
            int mid =(start+end) /2;
            if(numbers[mid]==key)
            {return mid;}
            else if(numbers[mid]>key)
            {end = mid - 1;}
            else
            {start= mid +1;}
             }
             
             return 0;


    }
    

    public static void main(String[] args) {
        int arr[]={5,9,12,32,56,65,89};
        System.out.println(binarysearch(arr, 56));
    }
}
