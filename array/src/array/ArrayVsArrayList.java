package array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // --- DEMONSTRATING ARRAYS ---
        System.out.println("=== ARRAY DEMONSTRATION ===");

        // 1. Declaration and initialization of a fixed-size array.
        // The size of 5 is permanent and cannot be changed.
        int[] numberArray = new int[5];

        // 2. Assigning values to the array using index.
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;
        // numberArray[5] = 60; // This would throw an ArrayIndexOutOfBoundsException

        // 3. Printing the array requires a helper method like Arrays.toString().
        System.out.println("Array contents: " + Arrays.toString(numberArray));

        // --- DEMONSTRATING ARRAYLISTS ---
        System.out.println("\n=== ARRAYLIST DEMONSTRATION ===");

        // 1. Declaration and initialization of a dynamic ArrayList.
        // The size is not fixed and will grow as we add elements.
        ArrayList<Integer> numberList = new ArrayList<>();

        // 2. Adding elements using the .add() method. The list size increases automatically.
        numberList.add(10); // Index 0
        numberList.add(20); // Index 1
        numberList.add(30); // Index 2
        numberList.add(40); // Index 3 - This would be impossible with our initial array of size 3.

        System.out.println("ArrayList contents: " + numberList);

        // 3. Demonstrating a built-in method: removing an element by value.
        // The list automatically shifts subsequent elements to the left.
        numberList.remove(Integer.valueOf(20));
        System.out.println("ArrayList after removing 20: " + numberList);

        // 4. Demonstrating another built-in method: inserting an element at a specific index.
        numberList.add(1, 99); // Inserts 99 at index 1
        System.out.println("ArrayList after inserting 99 at index 1: " + numberList);

        // --- KEY DIFFERENCES SUMMARY IN CODE ---
        System.out.println("\n=== KEY DIFFERENCES SUMMARY ===");
        System.out.println("Final Array size: " + numberArray.length); // Still 5
        System.out.println("Final ArrayList size: " + numberList.size()); // Now 4 (dynamic)
    }
}