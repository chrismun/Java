       import java.io.*;
       import static java.lang.System.*;

       import java.util.Scanner;
       import java.lang.Math;


       class Main {

        public static String[] list = {};
        public static void main(String str[]) throws IOException {

         Scanner scan = new Scanner(System.in);
         int array1[] = new int[10000];
         int array2[] = new int[10000];
         int n;
         System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
         for (int i = 0; i < 10000; i++) {
          n = scan.nextInt();
          if (n > 0) {
           array1[i] = n;
          } else {
           break;
          }
         }
         System.out.println("Enter the values for the second array, up to 10000 values, enter zero or a negative number to quit");
         for (int i = 0; i < 10000; i++) {
          n = scan.nextInt();
          if (n > 0) {
           array2[i] = n;
          } else {
           break;
          }
         }
         System.out.println("First Array:");
         for (int i = 0; i < 10000; i++) {
          if (array1[i] == 0) {
           break;
          }
          System.out.print(array1[i]);
          System.out.print(" ");
         }
         System.out.println("");
         System.out.println("Second Array:");
         for (int i = 0; i < 10000; i++) {
          if (array2[i] == 0) {
           break;
          }
          System.out.print(array2[i]);
          System.out.print(" ");
         }
         int testfororder = 1;
         for (int i = 1; i < 10000; i++) {
          if (array1[i] == 0) {
           break;
          }
          if (array1[i] < array1[i - 1]) {
           testfororder = 0;
          }
         }
         for (int i = 1; i < 10000; i++) {
          if (array2[i] == 0) {
           break;
          }
          if (array2[i] < array2[i - 1]) {
           testfororder = 0;
          }
         }
         System.out.println("");
         if (testfororder == 0) {
          System.out.println("ERROR: Array not in correct order");
         } else {
          System.out.println("Merged Array:");
          int array1val = 0;
          int array2val = 0;
          for (int i = 0; i <= 20000; i++) {
           if (!((array1[array1val] <= 0) && (array2[array2val] <= 0))) {
            if (array1[array1val] <= array2[array2val] && array1[array1val] > 0) {
             System.out.print(array1[array1val] + " ");
             array1val += 1;
            }
            if (array1[array1val] > array2[array2val] && array2[array2val] > 0) {
             System.out.print(array2[array2val] + " ");
             array2val += 1;
            }
           }
           if (array1[array1val] <= 0 && array2[array2val] > 0) {
            System.out.print(array2[array2val] + " ");
            array2val += 1;
           }
           if (array2[array2val] <= 0 && array1[array1val] > 0) {
            System.out.print(array1[array1val] + " ");
            array1val += 1;

           }
           if ((array1[array1val] <= 0) && (array2[array2val] <= 0)) {
            break;
           }
          }
         }
        }
       }
