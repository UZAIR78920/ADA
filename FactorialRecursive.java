// Experiment 1.b
// ALGORITHM Factorial(n)
//     Input: A non-negative integer n
//     Output: Factorial of n
//     if n == 0 then
//         return 1
//     else
//         return n * Factorial(n - 1)
public class FactorialRecursive {
    public static long factorial(int n){
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        long st=System.nanoTime();
        int num=5;
        System.out.println("Factorial of "+num+" is: "+factorial(num));
        long et=System.nanoTime();
        System.out.println("Time Taken: "+(et-st));
    }
}