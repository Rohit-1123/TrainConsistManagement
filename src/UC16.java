public class UseCase16TrainConsistMgmnt {

    // Bubble Sort Method (important for testing)
    public static void bubbleSort(int[] capacities) {

        int n = capacities.length;

        // Outer loop (passes)
        for (int i = 0; i < n - 1; i++) {

            // Inner loop (comparison)
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if left > right
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("=========================================\n");

        // Create array
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Apply Bubble Sort
        bubbleSort(capacities);

        // Display sorted
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}
