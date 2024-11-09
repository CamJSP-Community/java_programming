package com.brandoniscoding;

import java.util.Scanner;
import com.brandoniscoding.algorithms.BubbleSort;
import com.brandoniscoding.algorithms.InsertionSort;
import com.brandoniscoding.algorithms.MergeSort;
import com.brandoniscoding.algorithms.QuickSort;
import com.brandoniscoding.algorithms.SortAlgorithm;
import com.brandoniscoding.utils.MainUtils;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying a welcome message
        System.out.println("=== Sorting Algorithm Test ===");
        System.out.println("Choose the sorting algorithm and the action to perform.\n");

        // Getting input array from the user
        Integer[] dataArray = MainUtils.inputData(scanner);

        // Main loop for selecting sorting algorithm and actions
        while (true) {
            MainUtils.displayAlgorithmMenu();
            int algorithmChoice = MainUtils.getUserChoice(scanner);

            SortAlgorithm<Integer> selectedAlgorithm = null;
            switch (algorithmChoice) {
                case 1:
                    selectedAlgorithm = new BubbleSort<>();
                    break;
                case 2:
                    selectedAlgorithm = new InsertionSort<>();
                    break;
                case 3:
                    selectedAlgorithm = new MergeSort<>();
                    break;
                case 4:
                    selectedAlgorithm = new QuickSort<>();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Action menu: execute sort or display description
            System.out.println("1. Execute the sort");
            System.out.println("2. Display the algorithm description");
            System.out.print("Enter your choice: ");
            int actionChoice = MainUtils.getUserChoice(scanner);

            if (actionChoice == 1) {
                System.out.println("\n--- Before Sorting ---");
                MainUtils.printArray(dataArray);

                // Measure and execute sort
                long startTime = System.nanoTime();
                selectedAlgorithm.sort(dataArray);
                long endTime = System.nanoTime();

                System.out.println("\n--- After Sorting ---");
                MainUtils.printArray(dataArray);

                // Display execution time
                long duration = endTime - startTime;
                System.out.println("\nExecution Time: " + duration + " nanoseconds.");
            } else if (actionChoice == 2) {
                System.out.println("\nAlgorithm Description:");
                System.out.println(selectedAlgorithm.getDescription());
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
