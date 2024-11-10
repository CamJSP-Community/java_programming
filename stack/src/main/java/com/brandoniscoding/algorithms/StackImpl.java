package com.brandoniscoding.algorithms;

public interface StackImpl<T> {

    // Method to push an element onto the stack
    void push(T value);

    // Method to pop an element onto the stack
    T pop();

    // Method to pop at the top element without remove it 
    T peek();

    // Method ti check if the is empty
    boolean isEmpty();

    // Method to get a current size of the stack
    int size();

    // Method to clear all elements from the stack
    void clear();

    // Method to search for an element in the stack and return its position from the top (1-based index)
    int search(T element);

    // Method to check if a specific element is present in the stack
    boolean contains(T element);

    // Method to get description
    void description();

}
