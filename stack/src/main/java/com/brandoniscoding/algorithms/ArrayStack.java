package com.brandoniscoding.algorithms;

public class ArrayStack<T> implements StackImpl<T> {

    private T[] arrayStack;
    private int top;
    
    @SuppressWarnings("unchecked")
    ArrayStack() {
        this.arrayStack = (T[]) new Object[0];
        this.top = -1;
    }

    @Override
    public void push(T value) {
        if (top == arrayStack.length - 1) {
            resizeArray();
        }
        arrayStack[++top] = value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        T value = arrayStack[top];
        arrayStack[top--] = null;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return arrayStack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= top; i++) {
            arrayStack[i] = null;
        }
        top = -1;
    }

    @Override
    public int search(Object element) {
        for (int i = top; i >= 0; i--) {
            if (arrayStack[i].equals(element)) {
                return top - i; 
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i <= top; i++) {
            if (arrayStack[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void description() {
        System.out.println("Array-based stack implementation.");
    }

    private void resizeArray() {
        T[] newArray = (T[]) new Object[arrayStack.length * 2];
        System.arraycopy(arrayStack, 0, newArray, 0, arrayStack.length);
        arrayStack = newArray;
    }
}
