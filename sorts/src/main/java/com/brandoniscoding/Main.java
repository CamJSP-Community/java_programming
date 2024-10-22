package com.brandoniscoding;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.brandoniscoding.algorithms.BubbleSort;
import com.brandoniscoding.algorithms.InsertionSort;
import com.brandoniscoding.algorithms.SortAlgorithm;
import com.brandoniscoding.utils.ArrayUtils;


public class Main {
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62}; // Sample array to be sorted
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                displayMenu();
                
                int choice = getUserChoice(scanner);
                
                switch (choice) {
                    case 1:
                        executeAlgorithm(bubbleSort, array, scanner);
                    case 2:
                        executeAlgorithm(insertionSort, array, scanner);
                        break;
                    case 0: 
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

    private static void displayMenu() {
        System.out.println("=== Menu for Choosing Algorithm ===");
        System.out.println("1. Bubble Sort");
        System.out.println("1. Insertion  Sort");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }


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
