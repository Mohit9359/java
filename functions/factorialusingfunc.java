import java.util.Scanner;
public class factorialusingfunc {
    public static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;}
            return f;   }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    int n = sc.nextInt();
    System.out.println("enter the value  of r");
    int r = sc.nextInt();


    long factorial_n=factorial(n);
    System.out.println(factorial_n);
    long factorial_r=factorial(r);
    System.out.println(factorial_r);
    long nminusr=factorial(n-r);
    System.out.println(nminusr);


    long product = factorial_r*nminusr;
    System.out.println(product);
    long ncr = factorial_n / product;
    System.out.println(ncr);

sc.close();
    }
    }
