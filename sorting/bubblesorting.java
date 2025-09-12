package sorting;

public class bubblesorting {
    public static void bubblesort(int array[]){
        for (int j=0;j<array.length-1;j++){
        for(int i=0;i<array.length-1-j;i++){
            if(array[i]>array[i+1]){
                int temp= array[i+1];
                array[i+1]=array[i];
                array[i]=temp;
            }
            
        }}
    }
    public static void printarr(int array[]){
        for( int i=0;i<array.length;i++){System.out.println(array[i]);}
    }
    public static void main(String[] args) {
        int array[] = {5,6,4,2,8,1,55,89,98,100,1000,152};
        bubblesort(array);
        printarr(array);
    }
    
}
