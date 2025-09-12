public class linearsearch {
    public static int linearsearchh(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
       int numbers[]={5,7,6,8,4,1,10,56,15,14};
       int key=56;
       int index= linearsearchh(numbers,key);
       System.out.println(index);

    }


    
}
