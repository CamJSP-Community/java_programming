package com.brandoniscoding;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.brandoniscoding.algorithms.BubbleSort;
import com.brandoniscoding.algorithms.SortAlgorithm;
import com.brandoniscoding.utils.ArrayUtils;

/**
 * Main class for demonstrating different sorting algorithms.
 * <p>
 * This class provides a simple console-based menu for users 
 * to choose and execute sorting algorithms, as well as 
 * view their documentation.
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62}; // Sample array to be sorted
        BubbleSort bubbleSort = new BubbleSort();

        // Using try-with-resources to ensure Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                displayMenu();
                
                int choice = getUserChoice(scanner);
                
                switch (choice) {
                    case 1:
                        executeAlgorithm(bubbleSort, array, scanner);
                        break;
                    case 0: // Exit option
                        System.out.println("Exiting program. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

    /**
     * Displays the main menu options to the user.
     */
    private static void displayMenu() {
        System.out.println("=== Menu for Choosing Algorithm ===");
        System.out.println("1. Bubble Sort");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Gets the user's choice from the input.
     *
     * @param scanner the Scanner instance to read user input.
     * @return the chosen option as an integer.
     */
    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    /**
     * Executes the selected sorting algorithm or displays its documentation.
     * 
     * @param algorithm the sorting algorithm to execute.
     * @param array the array of integers to sort.
     * @param scanner the Scanner instance for user input.
     */
    private static void executeAlgorithm(SortAlgorithm algorithm, int[] array, Scanner scanner) {
        System.out.println("1. Execute a sort");
        System.out.println("2. Print its documentation");
        System.out.print("Choose your option: ");
        
        int option = scanner.nextInt();

        if (option == 1) {
            algorithm.sort(array);
            System.out.println("Sorted Array: ");
            ArrayUtils.printArray(array);
        } else if (option == 2) {
            System.out.println("Algorithm Description: ");
            System.out.println(algorithm.getDescription());
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }
}
