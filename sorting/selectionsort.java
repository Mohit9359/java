package Sorting;

public class selectionsort {
    public static void selection(int array[]){
       for(int i = 0; i<array.length -1;i++){
        int minposition=i;
        for(int j=i+1;j<array.length;j++){
            if(array[j]<array[minposition]){
                minposition =j;
            }
        }
        int temp = array[minposition];
        array[minposition ]=array[i];
        array[i]=temp;
       }
    }
    public static void printing(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);

        }

    }
    public static void main(String[] args) {
        int array[]={1,9,5,8,2,99};
        selection(array);
        printing(array);

    }
    
}
