package com.brandoniscoding.utils;

import java.util.Scanner;

public class MainUtils {

    // Method to display the algorithm menu
    public static void displayAlgorithmMenu() {
        System.out.println("\n=== Algorithm Selection ===");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("0. Exit");
        System.out.print("Select an algorithm: ");
    }

    // Method to get a valid integer choice from the user with error handling
    public static int getUserChoice(Scanner scanner) {
        int choice = -1;
        boolean valid = false;
        while (!valid) {
            try {
                choice = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                scanner.nextLine(); // Clear invalid input
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
        return choice;
    }

    // Method to input an integer array from the user
    public static Integer[] inputData(Scanner scanner) {
        System.out.print("Enter the number of elements to sort: ");
        int n = getUserChoice(scanner);
        Integer[] data = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            data[i] = getUserChoice(scanner);
        }
        return data;
    }

    // Method to print an array of integers
    public static void printArray(Integer[] array) {
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
