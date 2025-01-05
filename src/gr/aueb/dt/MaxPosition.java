package gr.aueb.dt;

public class MaxPosition {
    public static int getMaxPosition(int[] arr, int low, int high) {
        if(low < 0 || high >= arr.length || low > high){
            System.out.println("Error in array dimensions");
        }
        // Initialize max as the first element in the range
        int max = arr[low];
        int maxPosition = low;

        // Loop to find the maximum element
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];       // We update the maximum value
                maxPosition = i;    // We update the maximum position
            }
        }

        return maxPosition; // We return the maxposition
    }

    public static void main(String[] args) {
        // We declare and initialize an array
        int[] arr = {4, 8, 10, 9, 6, 7, 2};
        int low = 0;
        int high = arr.length-1;

        // We call the getMaxPosition method
        int maxPosition = getMaxPosition(arr, low, high);

        // Print the result
        System.out.println("The position of the maximum element is: " + maxPosition);
        System.out.println();
    }
}
