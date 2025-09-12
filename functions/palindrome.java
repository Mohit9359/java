public class palindrome {
    public static boolean isPalindrome(int a) {
        int original = a;
        int reversed = 0;
        while (a > 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a / 10;
        }
        return original == reversed;
    }

    public static void main(String args[]) {
        int num = 979; // You can change this value to test other numbers
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }}}