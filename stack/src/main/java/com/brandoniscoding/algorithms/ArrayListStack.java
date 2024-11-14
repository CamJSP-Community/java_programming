package com.brandoniscoding.algorithms;

import java.util.ArrayList;

public class ArrayListStack<T> implements StackImpl<T> {

    private ArrayList<T> arrayListStack;

    public ArrayListStack() {
        this.arrayListStack = new ArrayList<>();
    }

    @Override
    public void push(T value) {
        arrayListStack.add(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return arrayListStack.remove(arrayListStack.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return arrayListStack.get(arrayListStack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return arrayListStack.isEmpty();
    }

    @Override
    public int size() {
        return arrayListStack.size();
    }

    @Override
    public void clear() {
        arrayListStack.clear();
    }

    @Override
    public int search(T element) {
        int index = arrayListStack.lastIndexOf(element);
        return index >= 0 ? size() - index : -1;
    }

    @Override
    public boolean contains(T element) {
        return arrayListStack.contains(element);
    }

    @Override
    public void description() {
        StringBuilder desc = new StringBuilder();
        
        desc.append("ArrayList-based stack implementation.\n")
            .append("This implementation uses an ArrayList to store stack elements, ")
            .append("offering fast access by index and constant-time push and pop operations at the end.\n")
            .append("\nMethods:\n")
            
            .append("1. push(T value):\n")
            .append("   - Description: Adds an element to the top of the stack.\n")
            .append("   - Time Complexity: O(1), since adding to the end of ArrayList is usually constant time.\n")
            .append("   - Space Complexity: O(1) for the new element.\n\n")
            
            .append("2. pop():\n")
            .append("   - Description: Removes and returns the top element of the stack.\n")
            .append("   - Time Complexity: O(1), since removing the last element is constant time.\n")
            .append("   - Space Complexity: O(1), as it only removes a reference.\n\n")
            
            .append("3. peek():\n")
            .append("   - Description: Returns the top element of the stack without removing it.\n")
            .append("   - Time Complexity: O(1), as it directly accesses the last element.\n")
            .append("   - Space Complexity: O(1), as it does not modify the list.\n\n")
            
            .append("4. isEmpty():\n")
            .append("   - Description: Checks if the stack is empty.\n")
            .append("   - Time Complexity: O(1), as it only checks the size of the ArrayList.\n")
            .append("   - Space Complexity: O(1).\n\n")
            
            .append("5. size():\n")
            .append("   - Description: Returns the number of elements in the stack.\n")
            .append("   - Time Complexity: O(1), as ArrayList keeps track of its size.\n")
            .append("   - Space Complexity: O(1).\n\n")
            
            .append("6. clear():\n")
            .append("   - Description: Removes all elements from the stack.\n")
            .append("   - Time Complexity: O(n), where n is the number of elements, as each element is dereferenced.\n")
            .append("   - Space Complexity: O(1), as only references are removed.\n\n")
            
            .append("7. search(T element):\n")
            .append("   - Description: Returns the 1-based position of the element from the top of the stack.\n")
            .append("   - Time Complexity: O(n), since it may require scanning the whole stack.\n")
            .append("   - Space Complexity: O(1), as it only returns an index.\n\n")
            
            .append("8. contains(T element):\n")
            .append("   - Description: Checks if an element is in the stack.\n")
            .append("   - Time Complexity: O(n), as it may need to scan the entire stack.\n")
            .append("   - Space Complexity: O(1), as no additional space is required.\n\n")

            .append("Overall Analysis:\n")
            .append("   - Average Time Complexity: O(1) for push, pop, peek, isEmpty, and size operations.\n")
            .append("   - Time Complexity: O(n) for search, contains, and clear.\n")
            .append("   - Space Complexity: O(n) for the ArrayList backing the stack.\n");

        System.out.println(desc.toString());
    }

}
