package com.brandoniscoding.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUtils {

    // Méthode pour obtenir un choix de l'utilisateur avec gestion d'erreur
    public static int getUserChoice(Scanner scanner) {
        int choice = -1;
        boolean valid = false;
        while (!valid) {
            try {
                choice = scanner.nextInt();
                valid = true;  // Si on a une entrée correcte, on quitte la boucle
            } catch (InputMismatchException e) {
                scanner.nextLine();  // Consomme la ligne invalide
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
        return choice;
    }

    // Méthode pour afficher le menu principal
    public static void displayMainMenu() {
        System.out.println("=== Main Menu ===");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Merge Sort");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    // Méthode pour afficher le menu de sélection du type de données
    public static void displayDataTypeMenu() {
        System.out.println("Select the data type you want to sort:");
        System.out.println("1. Numbers (Integer)");
        System.out.println("2. Strings");
        System.out.println("3. Booleans");
        System.out.print("Enter your choice: ");
    }

    // Méthode pour saisir un tableau de nombres
    public static Comparable<Integer>[] inputDataForNumbers(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    // Méthode pour saisir un tableau de chaînes
    public static Comparable<String>[] inputDataForStrings(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        return strings;
    }

    // Méthode pour saisir un tableau de booléens

    public static Comparable<Boolean>[] inputDataForBooleans(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        Boolean[] booleans = new Boolean[n];
        System.out.println("Enter the boolean values (true/false):");
        for (int i = 0; i < n; i++) {
            booleans[i] = scanner.nextBoolean();
        }
        return booleans;
    }
}
