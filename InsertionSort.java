public class InsertionSort {
static int comparisons = 0;
 public static void main(String[] args) {
  
  int[] A = { 5, 3, 8, 9, 1, 7, 0, 2, 6, 4 };
  System.out.println("Before Insertion Sort");
  for (int i = 0; i < A.length; i++) {
   System.out.print(A[i] + " ");
  }
  System.out.print("\n");
  
  int[] sorted = InsertionSort(A);
  
  System.out.println("After Insertion Sort");
  for (int i = 0; i < sorted.length; i++) {
   System.out.print(sorted[i] + " ");
  }
  System.out.print("\n");
  
  System.out.println("Total Comparisons: " + comparisons);
 }
 
 
 public static int[] InsertionSort(int[] arr) {

  int temp;
  for (int i = 1; i < arr.length; i++) {
   for (int j = i; j > 0; j--) {
    if (arr[j] < arr[j - 1]) {
     comparisons++;
     temp = arr[j];
     arr[j] = arr[j - 1];
     arr[j - 1] = temp;
    }

   }
  }
 
 return arr;
}
}
