# Sorting Algorithms

This project demonstrates the implementation of multiple sorting algorithms. Sorting algorithms are essential in computer science for ordering data, making it easier to analyze, search, or optimize resources.

## Overview

Sorting algorithms take a collection of items (often numbers or strings) and arrange them in a specific order. In this project, each algorithm is implemented in a generic way to allow for sorting different types of data, provided that they implement the `Comparable` interface.

The key sorting algorithms included are:

- **Bubble Sort**
- **Selection Sort**
- **Insertion Sort**
- **Merge Sort**
- **Quick Sort**

Each algorithm is analyzed in terms of its:
- **Time Complexity**: How fast it performs relative to the input size.
- **Space Complexity**: The amount of additional memory it uses.
- **Stability**: Whether it preserves the order of equal elements.

## Algorithms

### 1. Bubble Sort
A simple, comparison-based algorithm that repeatedly steps through the list, compares adjacent items, and swaps them if they are out of order.

- **Time Complexity**: O(n^2) in the worst and average cases, O(n) in the best case when the array is already sorted.
- **Space Complexity**: O(1)
- **Stability**: Stable

### 2. Selection Sort
Selects the minimum element from the unsorted portion of the list and swaps it with the first unsorted element.

- **Time Complexity**: O(n^2) for all cases.
- **Space Complexity**: O(1)
- **Stability**: Not stable (may require modifications for stability)

### 3. Insertion Sort
Builds the final sorted list one element at a time by comparing each new element to the sorted elements and inserting it in the correct position.

- **Time Complexity**: O(n^2) in the worst and average cases, O(n) in the best case.
- **Space Complexity**: O(1)
- **Stability**: Stable

### 4. Merge Sort
A divide-and-conquer algorithm that divides the list into halves, sorts each half, and then merges the two sorted halves together.

- **Time Complexity**: O(n log n) for all cases.
- **Space Complexity**: O(n) due to the need for temporary arrays.
- **Stability**: Stable

### 5. Quick Sort
A highly efficient divide-and-conquer algorithm that selects a "pivot" element, partitions the list around the pivot, and then recursively sorts the partitions.

- **Time Complexity**: O(n log n) on average, O(n^2) in the worst case (can be optimized with random pivots).
- **Space Complexity**: O(log n) on average due to recursion, O(n) in the worst case.
- **Stability**: Not stable

## Running the Project

1. **Compile the Code**: Make sure you have Java and Maven installed, and then compile the code using Maven with the following command:

   ```bash
   mvn compile
   ```

2. **Run the Sorting Algorithms**: To run the main program, use Maven with the following command:

   ```bash
   mvn exec:java -Dexec.mainClass="com.brandoniscoding.Main"
   ```

3. **Run the Tests**: To execute the unit tests for the sorting algorithms, run the following Maven command:

   ```bash
   mvn test
   ```

   This will execute all the tests defined in the project and show the results in the terminal.


## Contributing

1. **Fork the Repository**: Make your changes in a branch from `master`.
2. **Commit Messages**: Follow conventions, e.g., `feat: add new sorting algorithm` or `fix: optimize quicksort partition`.
3. **Pull Requests**: Ensure your code passes all tests before opening a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
