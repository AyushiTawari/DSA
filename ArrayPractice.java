
/*
Arrays Programs - Set 01 

1.Declare and print an array
2.Input and output elements of an array
3.Find the sum of elements in an array
4.Find the average of elements in an array
5.Find the maximum element
6.Find the minimum element
7.Count even and odd numbers
8.Print elements at even indices
9.Print elements at odd indices
10.Count positive and negative numbers
11.Replace all negative numbers with zero
12.Search an element (Linear Search)
13.Copy an array
14.Reverse an array
15.Swap first and last elements
16.Print array in reverse order
17.Count frequency of a given number
18.Find the index of a specific element
19.Replace all even numbers with -1
20.Multiply all elements of the array
 */
import java.util.*;

public class ArrayPractice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(java.util.Arrays.toString(arr));

    System.out.print("Number of elements:");
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    System.out.println("Enter elements one by one");
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println(java.util.Arrays.toString(arr1));
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr1[i];
    }
    System.out.println("Sum of elements is:" + sum);
    System.out.println("Average of elements is:" + sum / n);
    int max = arr1[0];
    int min = arr1[0];
    for (int i = 1; i < n; i++) {
      if (arr1[i] > max) {
        max = arr1[i];
      }
    }
    for (int i = 1; i < n; i++) {
      if (arr1[i] < min) {
        min = arr1[i];
      }
    }
    System.out.println("Maximum element is:" + max + " and the minimum element is:" + min);

    int even = 0;
    int odd = 0;
    for (int i = 0; i < n; i++) {
      if (arr1[i] % 2 == 0) {
        even += 1;
      } else {
        odd += 1;
      }
    }
    System.out.println("Even number of elements are:" + even + " and odd number of elements are:" + odd);
    for (int i = 0; i < n; i++) {
      if (arr1[i] % 2 == 0) {
        System.out.println("Even element:" + arr1[i] + " at index:" + i);
      }
    }
    for (int i = 0; i < n; i++) {
      if (arr1[i] % 2 != 0) {
        System.out.println("Odd element:" + arr1[i] + " at index:" + i);
      }
    }
    for (int i = 0; i < n; i++) {
      if (arr1[i] % 2 == 0) {
        arr1[i] = -1;
      }
    }
    System.out.println("Replaced all even elements by -1");
    System.out.println(java.util.Arrays.toString(arr1));
    int[] arr2 = { -1, 10, 11, -9, 90 };
    System.out.println(java.util.Arrays.toString(arr2));

    int countneg = 0;
    for (int i = 0; i < arr2.length; i++) {
      if (arr2[i] < 0) {
        countneg += 1;
      }
    }
    System.out.println("Negative number count is:" + countneg);
    for (int i = 0; i < arr2.length; i++) {
      if (arr2[i] < 0) {
        arr2[i] = 0;
      }
    }
    System.out.println("Replaced all negative elements by 0");
    System.out.println(java.util.Arrays.toString(arr2));
    int[] arr3 = { 1, 6, 90, 20, 15 };
    System.out.println(java.util.Arrays.toString(arr3));

    System.out.print("Enter element to search:");
    int sear = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] == sear) {
        found = true;
        System.out.println("Element at index:" + i);
      }
    }
    if (found == false) {
      System.out.println("Element not in array");
    }
    int[] revarr = new int[arr3.length];
    int j = 0;
    for (int i = arr3.length - 1; i >= 0; i--) {
      revarr[j] = arr3[i];
      j++;
    }
    System.out.println("Reversed array is:" + java.util.Arrays.toString(revarr));
    int copy[] = new int[arr3.length];
    for (int i = 0; i < arr3.length; i++) {
      copy[i] = arr3[i];
    }
    System.out.println("Copy of array is:" + java.util.Arrays.toString(copy));
    System.out.println("Array in reverse order:");
    for (int i = arr3.length - 1; i >= 0; i--) {
      System.out.print(arr3[i] + " ");
    }
    System.out.println();
    System.out.println(java.util.Arrays.toString(arr3));
    int temp = arr3[0];
    arr3[0] = arr3[arr3.length - 1];
    arr3[arr3.length - 1] = temp;
    System.out.println("Swapped last and first element");
    System.out.println(java.util.Arrays.toString(arr3));

    int[] arr4 = { 10, 4, 1, 5, 10, 98, 10, 1 };
    System.out.println(java.util.Arrays.toString(arr4));
    System.out.print("Enter element to count frequency:");
    int search = sc.nextInt();
    int fre = 0;
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] == search) {
        fre += 1;
      }
    }
    System.out.println("Frequency of element is:" + fre);

    int prod = 1;
    for (int i = 0; i < arr4.length; i++) {
      prod *= arr4[i];
    }
    System.out.println("Product of array elements are:" + prod);
  }

}
