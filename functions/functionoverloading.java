public class functionoverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(20, 30));         // Calls add(int, int)
        System.out.println(add(20, 30, 40));     // Calls add(int, int, int)
        System.out.println(add(20.30f, 30.45f)); // Calls add(float, float)
    }
}