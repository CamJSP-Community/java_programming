package com.brandoniscoding.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack<T> implements StackImpl<T> {

    private Deque<T> dequeStack = new ArrayDeque<>();

    @Override
    public void push(T value) {
        dequeStack.push(value); // Utilise `push` au lieu de `add` pour respecter l'aspect LIFO de la pile
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty"); 
        } 
        return dequeStack.pop();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty"); 
        } 
        return dequeStack.peek(); // Utilise `peek` pour obtenir l'élément sans le supprimer
    }

    @Override
    public boolean isEmpty() {
        return dequeStack.isEmpty();
    }

    @Override
    public int size() {
        return dequeStack.size();
    }

    @Override
    public void clear() {
        dequeStack.clear();
    }
    @Override
public int search(T element) {
    int position = 1; // Position 1-based depuis le sommet
    for (T item : dequeStack) {
        if (item.equals(element)) {
            return position;
        }
        position++;
    }
    return -1; // Élément non trouvé
}

    @Override
    public boolean contains(T element) {
        return dequeStack.contains(element);
    }

    @Override
    public void description() {
        StringBuilder desc = new StringBuilder();

        desc.append("Deque-based stack implementation.\n")
            .append("This implementation uses a deque to manage stack elements.\n")
            .append("The stack grows dynamically, providing efficient operations.\n\n");

        desc.append("Methods:\n");

        desc.append("1. push(T value):\n")
            .append("   - Description: Adds an element to the top of the stack (LIFO).\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1), as it adds a single element to the deque.\n\n");

        desc.append("2. pop():\n")
            .append("   - Description: Removes and returns the top element of the stack.\n")
            .append("     Throws IllegalStateException if stack is empty.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1), as no extra space is used after popping an element.\n\n");

        desc.append("3. peek():\n")
            .append("   - Description: Returns the top element without removing it.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1). No additional space is used.\n\n");

        desc.append("4. isEmpty():\n")
            .append("   - Description: Checks if the stack has no elements.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        desc.append("5. size():\n")
            .append("   - Description: Returns the number of elements in the stack.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        desc.append("6. clear():\n")
            .append("   - Description: Removes all elements from the stack.\n")
            .append("   - Time Complexity: O(n), as it removes each element from the deque.\n")
            .append("   - Space Complexity: O(1), no additional space used after clearing.\n\n");

        desc.append("7. search(T element):\n")
            .append("   - Description: Searches for an element's position from the top.\n")
            .append("   - Time Complexity: O(n), as it may require scanning through the entire stack.\n")
            .append("   - Space Complexity: O(1), no additional space is allocated.\n\n");

        desc.append("8. contains(T element):\n")
            .append("   - Description: Checks if an element exists in the stack.\n")
            .append("   - Time Complexity: O(n), as it may scan the entire deque.\n")
            .append("   - Space Complexity: O(1), no additional space is used.\n\n");

        desc.append("Overall Time Complexity:\n")
            .append("   - Average Time Complexity for push, pop, peek, isEmpty, and size: O(1).\n")
            .append("   - Time Complexity for search and contains: O(n).\n");

        System.out.println(desc.toString());
    }

}
