package com.brandoniscoding;

import java.util.Scanner;
import com.brandoniscoding.algorithms.BubbleSort;
import com.brandoniscoding.algorithms.InsertionSort;
import com.brandoniscoding.algorithms.QuickSort;
import com.brandoniscoding.algorithms.MergeSort;
import com.brandoniscoding.algorithms.SelectionSort;
import com.brandoniscoding.algorithms.SortAlgorithm;
import com.brandoniscoding.utils.ArrayUtils;
import com.brandoniscoding.utils.MainUtils;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Affichage du menu pour le type de données
        MainUtils.displayDataTypeMenu();
        int dataTypeChoice = MainUtils.getUserChoice(scanner);

        Comparable<?>[] dataArray = null; 
        switch (dataTypeChoice) {
            case 1: 
                dataArray = (Comparable[]) MainUtils.inputDataForNumbers(scanner); 
                break;
            case 2: 
                dataArray = (Comparable[]) MainUtils.inputDataForStrings(scanner); 
                break;
            case 3: 
                dataArray = (Comparable[]) MainUtils.inputDataForBooleans(scanner); 
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Création des instances des algorithmes de tri
        SortAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        SortAlgorithm<String> insertionSort = new InsertionSort<>();
        SortAlgorithm<Integer> selectionSort = new SelectionSort<>();
        SortAlgorithm<Integer> mergeSort = new MergeSort<>();
        SortAlgorithm<Boolean> quickSort = new QuickSort<>();

        // Boucle principale pour sélectionner un algorithme
        while (true) {
            MainUtils.displayMainMenu();
            int choice = MainUtils.getUserChoice(scanner);

            switch (choice) {
                case 1:
                    executeAlgorithm(bubbleSort, (Integer[]) dataArray, scanner);  // Tri par Bulles
                    break;
                case 2:
                    executeAlgorithm(insertionSort, (String[]) dataArray, scanner);  // Tri par Insertion
                    break;
                case 3:
                    executeAlgorithm(selectionSort, (Integer[]) dataArray, scanner);  // Tri par Selection
                    break;
                case 4:
                    executeAlgorithm(mergeSort, (Integer[]) dataArray, scanner);  // Tri par Fusion
                    break;
                case 5:
                    executeAlgorithm(quickSort, (Boolean[]) dataArray, scanner);  // Tri Rapide
                    break;
                case 0: 
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static <T extends Comparable<T>> void executeAlgorithm(SortAlgorithm<T> algorithm, T[] array, Scanner scanner) {
        System.out.println("1. Execute the sort");
        System.out.println("2. Print its documentation");
        System.out.print("Choose your option: ");
        
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Unsorted Array: ");
            ArrayUtils.printArray(array);

            // Start timing the algorithm execution
            long startTime = System.nanoTime();
            algorithm.sort(array);
            long endTime = System.nanoTime();

            System.out.println("Sorted Array: ");
            ArrayUtils.printArray(array);
            
            // Calculate and display the time taken
            long duration = endTime - startTime;
            System.out.println("Execution Time: " + duration + " nanoseconds.");
        } else if (option == 2) {
            System.out.println("Algorithm Description: ");
            System.out.println(algorithm.getDescription());
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }
}
