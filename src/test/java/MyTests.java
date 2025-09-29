import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    @Test
    @DisplayName("Selection Sort - Basic functionality")
    public void testSelectionSortBasic() {
        int[] input = {6, 1, 3, 8, 2, 9};
        int[] expected = {1, 2, 3, 6, 8, 9};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should correctly sort the array");
    }

    @Test
    @DisplayName("Selection Sort - Larger array")
    public void testSelectionSortLarger() {
        int[] input = {12, 5, 23, 74, 15, 86, 2};
        int[] expected = {2, 5, 12, 15, 23, 74, 86};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle larger arrays");
    }

    @Test
    @DisplayName("Selection Sort - Already sorted array")
    public void testSelectionSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle already sorted arrays");
    }

    @Test
    @DisplayName("Selection Sort - Reverse sorted array")
    public void testSelectionSortReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle reverse sorted arrays");
    }

    @Test
    @DisplayName("Selection Sort - Single element")
    public void testSelectionSortSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle single element arrays");
    }

    @Test
    @DisplayName("Selection Sort - Empty array")
    public void testSelectionSortEmpty() {
        int[] input = {};
        int[] expected = {};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle empty arrays");
    }

    @Test
    @DisplayName("Selection Sort - Duplicate elements")
    public void testSelectionSortDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle arrays with duplicates");
    }

    @Test
    @DisplayName("Selection Sort - Negative numbers")
    public void testSelectionSortNegative() {
        int[] input = {-3, 1, -4, 2, -1, 0};
        int[] expected = {-4, -3, -1, 0, 1, 2};
        int[] result = MyMain.selectionSort(input.clone());
        assertArrayEquals(expected, result, "Selection sort should handle negative numbers");
    }

    @Test
    @DisplayName("Insertion Sort - Basic functionality")
    public void testInsertionSortBasic() {
        int[] input = {6, 1, 3, 8, 2, 9};
        int[] expected = {1, 2, 3, 6, 8, 9};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should correctly sort the array");
    }

    @Test
    @DisplayName("Insertion Sort - Larger array")
    public void testInsertionSortLarger() {
        int[] input = {12, 5, 23, 74, 15, 86, 2};
        int[] expected = {2, 5, 12, 15, 23, 74, 86};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle larger arrays");
    }

    @Test
    @DisplayName("Insertion Sort - Already sorted array")
    public void testInsertionSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle already sorted arrays");
    }

    @Test
    @DisplayName("Insertion Sort - Reverse sorted array")
    public void testInsertionSortReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle reverse sorted arrays");
    }

    @Test
    @DisplayName("Insertion Sort - Single element")
    public void testInsertionSortSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle single element arrays");
    }

    @Test
    @DisplayName("Insertion Sort - Empty array")
    public void testInsertionSortEmpty() {
        int[] input = {};
        int[] expected = {};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle empty arrays");
    }

    @Test
    @DisplayName("Insertion Sort - Duplicate elements")
    public void testInsertionSortDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle arrays with duplicates");
    }

    @Test
    @DisplayName("Insertion Sort - Negative numbers")
    public void testInsertionSortNegative() {
        int[] input = {-3, 1, -4, 2, -1, 0};
        int[] expected = {-4, -3, -1, 0, 1, 2};
        int[] result = MyMain.insertionSort(input.clone());
        assertArrayEquals(expected, result, "Insertion sort should handle negative numbers");
    }
}