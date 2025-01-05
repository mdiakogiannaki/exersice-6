package gr.aueb.dt;

public class SecMinValue {
        public static int findSecondSmallest(int[] arr) {
            // Check of the array
            if (arr == null || arr.length < 2) {
                System.out.println("Error,the array must have at least two elements");
            }

            // Initialize variables
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            // Step 1: Find the smallest and second smallest elements
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    // Update second smallest before updating the smallest
                    secondSmallest = smallest;
                    smallest = arr[i];
                } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                    // Update second smallest if it's greater than smallest but smaller than second smallest
                    secondSmallest = arr[i];
                }
            }

            // Step 2: Check if a valid second smallest element exists
            if (secondSmallest == Integer.MAX_VALUE) {
                System.out.println("No valid second smallest element found");
            }

            // Step 3: Return the second smallest element
            return secondSmallest;
        }

        public static void main(String[] args) {
            // Declare and initialize the array
            int[] arr = {6, 9, 1, 7, 4, 9, 3};

            // Call the findSecondSmallest method
            int secondSmallest = findSecondSmallest(arr);

            // Print the result
            System.out.println("The second smallest element is: " + secondSmallest);
            System.out.println();
        }
    }


