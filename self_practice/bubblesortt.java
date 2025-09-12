package self_practice;

public class bubblesortt {
    public static void bubblesort(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]= array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void printarr(int array[]){
        for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int array[]={1,7,4,5,9};
        bubblesort(array);
        printarr(array);
    }
    
}
