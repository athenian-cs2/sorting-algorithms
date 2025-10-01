import java.util.Arrays;

public class MyMain {
  // Sorting:
  // Implement the selection sort algorithm that we discussed in class
  // to sort our code
  // This algorithm returns the sorted array
  public static int[] selectionSort(int[] arr) {
    // High-level description:
    // -Find the smallest element in the array
    // -Swap the element at index 0 with the smallest element
    // -Repeat that process for index 1, 2, 3, etc.

    return arr;
  }

  // Implement the insertion sort algorithm that we discussed in class
  // to sort our code
  // This algorithm returns the sorted array
  public static int[] insertionSort(int[] arr) {
    // High-level description:
    // -For each element in the array
    // -While that element is out of order compared to its left neighbor, swap it with that neighbor
    // -The result is that each element is "inserted" into its proper position!
    return arr;
  }

  public static void main(String[] args) {
    System.out.println("Selection Sort Tests");
    System.out.println(
        Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
    System.out.println(
        Arrays.toString(
            selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]

    System.out.println("Insertion Sort Tests");
    System.out.println(
        Arrays.toString(insertionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
    System.out.println(
        Arrays.toString(
            selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]
  }
}
