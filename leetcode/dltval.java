package leetcode;

public class dltval {
    public static int delete(int nums[], int val) {
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                System.out.println(nums[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 8, 4, 5, 6, 8, 8, 8, 5, 4, 6};
        System.out.println(delete(nums, 8));
    }
}