package Leetcode;
public class duplicates{
    public static void duplicate(int nums[]){
        int count =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[count-1]){
                nums[count]=nums[i];
                count++;
            }


            
        }

        for(int i=0;i<count;i++){
            System.out.println(nums[i]);
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,2,3,4,4,4,4,5};
        duplicate(nums);
    }





}

