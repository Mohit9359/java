// package self_practice;

// public class linsearch {
//     public static int linearsearch(int array[],int key){
//         for (int i=0;i<array.length;i++){
//             if ( array[i]==key){
//                 return i;
                
//             }
//         }
//         return 0;
//     }
    
//     public static void main(String[] args) {
//        int  array[] = {1,3,5,4,5,6,8,9};
//       System.out.println( linearsearch(array, 5));
//     }
// }

package self_practice;

public class linsearch {
    public static void linearsearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 4, 5, 6, 8, 9};
        linearsearch(array, 5);
    }
}