public class even {
    public static boolean isEven(int a){
        return a%2==0;

    }
    
    public static void main(String args[]){
        boolean evenn=isEven( 200);
        if(evenn){
            System.out.println("it is even");
        }
        else{System.out.println("not even");  }


    }
}
