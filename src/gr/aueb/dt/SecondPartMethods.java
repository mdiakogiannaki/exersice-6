package gr.aueb.dt;
import java.util.Arrays;

public class SecondPartMethods {
    // Search for an element in the array
    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Filter the even numbers
    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //  Mapping each element of the array to its double
    public static int[] mapToDouble(int[] arr) {
        int[] doubled = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i] * 2;
        }
        return doubled;
    }

    // Check if there is at least one positive number
    public static boolean hasPositiveNumber(int[] arr) {
        for (int num : arr) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    // Check if all elements in the array are positive
    public static boolean areAllPositive(int[] arr) {
        for (int num : arr) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
 //example
        int[] arr = {17, -3, 8, 18, -12, 9, 20, 5, 1};

        //Search for an element in the array
        int position = searchElement(arr, 5);
        System.out.println("Position of 5: " + position);

        // Filter the even numbers
        System.out.print("Even numbers: ");
        printEvenNumbers(arr);

        // Mapping each element of the array to its double
        int[] doubled = mapToDouble(arr);
        System.out.println("Doubled elements: " + Arrays.toString(doubled));

        // Check if there is at least one positive number
        boolean hasPositive = hasPositiveNumber(arr);
        System.out.println("Has positive number: " + hasPositive);

        //  Check if all elements in the array are positive
        boolean allPositive = areAllPositive(arr);
        System.out.println("All positive: " + allPositive);
    }
}
