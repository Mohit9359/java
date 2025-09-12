

public class largest {
    public static int largestt(int numbers[]){
        int largest=Integer.MIN_VALUE;
     for (int i =0;i<numbers.length;i++){ 
        if(largest<numbers[i]){
            largest=numbers[i];

        }

      }
      return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,8,4,39,22,54,6};
        System.out.println(largestt(numbers));
        
    }

    }
    

