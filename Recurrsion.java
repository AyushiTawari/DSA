
/*Recursion Programs - Practice 
1.Print Hello my dear N times using Recursion 
2.Print Numbers from N to 1 
3.Print Numbers from 1 to N
4.Find a factorial of a Number 
5.Find nth fibonacci Number 
6.Sum of first N natural Numbers 
7.Find the sum of digits of a number 
8.Count the Number of digits of a number 
9.Print Even Numbers from 2 to N 
10.Print a number in reverse 
11.Calculate product of first N natural Numbers 
12.Print sum of an array using Recursion 
13.Print all elements of an array using recursion 
14.Calculate sum of squares of first N numbers 
15.Check if number is palindrome
*/
import java.util.*;

public class Recurrsion {
  public static int revnumbers(int n) {
    if (n == 0) {
      return -1;
    } else {
      System.out.print(n + ",");
      return (revnumbers(n - 1));
    }
  }

  public static int numbers(int val, int n) {
    if (val > n) {
      return -1;
    } else {
      System.out.print(val +" ");
      return (numbers(val + 1, n));
    }
  }

  public static int naturalsum(int n) {
    if (n == 0) {
      return 0;
    } else {
      return (n + naturalsum(n - 1));
    }
  }

  public static int hellodear(int n) {
    if (n == 0) {
      return -1;
    } else {
      System.out.println("Hello my dear");
      return (hellodear(n - 1));
    }
  }

  public static int naturalprod(int n) {
    if (n == 1) {
      return 1;
    } else {
      return (n * naturalprod(n - 1));
    }
  }

  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return (n * factorial(n - 1));
    }
  }

  public static int fib(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else {
      return (fib(n - 1) + fib(n - 2));
    }
  }
  public static int palin(int n){
    int reversed=Integer.parseInt(reverseNumber(n,""));
    return reversed;
  }
  public static String reverseNumber(int n, String val) {
    if (n == 0){
      return val;
    }
    val+=n%10;
    n=n/10;
    return reverseNumber(n,val);
  }
  public static int count(int n,int c){
    if(n==0){
      return c;
    }
      n=n/10;
      c+=1;
      return(count(n,c));
  }
  public static int add(int n,int sum){
    if(n==0){
      return sum;
    }
      sum+=n%10;
      n=n/10;
      return(add(n,sum));
  }
  public static int squares(int n,int sum){
    if(n==0){
      return sum;
    }
    sum+=n*n;
    return squares(n-1,sum);
  }
  public static int even(int n) {
    if (n <= 0) {
      return 0;
    } else if (n % 2 == 0) {
      System.out.println(n);
    }
    return (even(n - 1));
  }

  public static int arrsum(int[] arr, int ind) {
    if (ind < 0 || ind > arr.length - 1) {
      return 0;
    } else {
      System.out.println("Array value:" + arr[ind]);
      return (arr[ind] + arrsum(arr, ind + 1));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value:");
    int n = sc.nextInt();
    System.out.println("Numbers in reverse");
    revnumbers(n);
    System.out.println();
    System.out.println("Numbers in order");
    numbers(1, n);
    System.err.println();
    System.out.println("Hellodear function call");
    
    hellodear(n);
    int sum = 0;
    int prod = 1;
    sum += naturalsum(n);
    prod *= naturalprod(n);
    System.out.println("Sum of natural numbers:" + sum);
    System.out.println("Product of natural numbers:" + prod);

    int fib = fib(n);
    System.out.println("Fibonnaci of " + n + " is:" + fib);

    int fact = 1;
    fact *= factorial(n);
    System.out.println("Factorial is " + fact);

    int even = even(n);
    System.out.println(even);

    int sq=squares(n, 0);
    System.out.println("Sum of sqaures is:"+sq);

    System.out.print("Number to reverse:");
    int rev=sc.nextInt();
    int reversed=Integer.parseInt(reverseNumber(rev,""));
    System.out.println("Reversed number is:"+reversed);
    int palind=palin(rev);
    if(palind==rev){
      System.out.println("Is pallindrome");
    }
    else{
      System.out.println("Not pallindrome");
    }
    int co=count(rev, 0);
    System.out.println("Number of digits are:"+co);

    int sumdigits=add(rev, 0);
    System.out.println("Sum of digits are:"+sumdigits);    

    int arr[] = { 7, 9, 10, 2, 1, 3 };
    int arrsum = 0;
    int ind = 0;
    arrsum += arrsum(arr, ind);
    System.out.println("Sum of array values is:" + arrsum);
  }
}
