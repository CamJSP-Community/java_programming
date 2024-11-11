package com.brandoniscoding.algorithms;

import java.util.LinkedList;

public class LinkedListStack<T> implements StackImpl<T> {

    private LinkedList<T> linkedListStack = new LinkedList<>();

    @Override
    public void push(T value) {
        linkedListStack.push(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return linkedListStack.pop(); 
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return linkedListStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return linkedListStack.isEmpty();
    }

    @Override
    public int size() {
        return linkedListStack.size();
    }

    @Override
    public void clear() {
        linkedListStack.clear();
    }

    @Override
    public int search(T element) {
        int index = linkedListStack.indexOf(element);
        return index >= 0 ? linkedListStack.size() - index : -1; // 1-based index from the top of the stack
    }

    @Override
    public boolean contains(T element) {
        return linkedListStack.contains(element);
    }

    @Override
    public void description() {
        // Using StringBuilder for efficient string concatenation
        StringBuilder desc = new StringBuilder();

        // General description of the stack implementation
        desc.append("LinkedList-based stack implementation.\n")
            .append("This implementation uses a linked list to store the stack elements.\n")
            .append("Unlike array-based stacks, this stack grows dynamically without needing resizing operations.\n");

        // Describing each method in the class
        desc.append("\nMethods:\n");

        // Description of the push() method
        desc.append("1. push(T value):\n")
            .append("   Adds an element to the top of the stack. Elements are added in constant time.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1) for the new element.\n\n");

        // Description of the pop() method
        desc.append("2. pop():\n")
            .append("   Removes and returns the top element of the stack.\n")
            .append("   Throws an IllegalStateException if the stack is empty.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1) as it only removes a reference.\n\n");

        // Description of the peek() method
        desc.append("3. peek():\n")
            .append("   Returns the top element of the stack without removing it.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        // Description of the isEmpty() method
        desc.append("4. isEmpty():\n")
            .append("   Checks if the stack is empty, returning true if there are no elements.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        // Description of the size() method
        desc.append("5. size():\n")
            .append("   Returns the number of elements in the stack.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        // Description of the clear() method
        desc.append("6. clear():\n")
            .append("   Removes all elements from the stack, clearing it.\n")
            .append("   - Time Complexity: O(n), as it iterates over all elements.\n")
            .append("   - Space Complexity: O(1), although the references are removed.\n\n");

        // Description of the search() method
        desc.append("7. search(Object element):\n")
            .append("   Searches for an element and returns its 1-based position from the top.\n")
            .append("   - Time Complexity: O(n), as it must iterate over elements.\n")
            .append("   - Space Complexity: O(1).\n\n");

        // Description of the contains() method
        desc.append("8. contains(Object element):\n")
            .append("   Checks if a specific element is present in the stack.\n")
            .append("   - Time Complexity: O(n), as it may require scanning the whole stack.\n")
            .append("   - Space Complexity: O(1).\n\n");

        // Overall time and space complexity analysis
        desc.append("Overall Time and Space Complexity:\n")
            .append("   - Average Time Complexity for push, pop, peek, isEmpty, and size: O(1).\n")
            .append("   - Time Complexity for search and contains: O(n).\n")
            .append("   - Space Complexity: O(n) for the linked list nodes.\n");

        // Printing the full description
        System.out.println(desc.toString());
    }

}
