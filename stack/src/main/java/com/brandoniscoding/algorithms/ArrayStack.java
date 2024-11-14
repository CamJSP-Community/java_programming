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
        StringBuilder desc = new StringBuilder();

        desc.append("Array-based stack implementation.\n")
            .append("This implementation uses an array to store the stack elements.\n")
            .append("The stack grows dynamically when necessary, doubling its size when the array is full.\n");

        desc.append("\nMethods:\n");

        desc.append("1. push(T value):\n")
            .append("   - Description: Adds an element to the top of the stack. If the stack is full,\n")
            .append("     it triggers a resize operation to double the size of the underlying array.\n")
            .append("   - Time Complexity: O(1) on average, O(n) when resizing occurs.\n")
            .append("   - Space Complexity: O(1) for adding one element, O(n) if resizing is required.\n\n");

        desc.append("2. pop():\n")
            .append("   - Description: Removes the element from the top of the stack and returns it.\n")
            .append("     If the stack is empty, it throws an IllegalStateException.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1). The space usage does not change after an element is popped.\n\n");

        desc.append("3. peek():\n")
            .append("   - Description: Returns the element at the top of the stack without removing it.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1). No additional space is used.\n\n");

        desc.append("4. isEmpty():\n")
            .append("   - Description: Checks if the stack is empty. Returns true if empty, false otherwise.\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        desc.append("5. size():\n")
            .append("   - Description: Returns the current size of the stack (number of elements).\n")
            .append("   - Time Complexity: O(1).\n")
            .append("   - Space Complexity: O(1).\n\n");

        desc.append("6. clear():\n")
            .append("   - Description: Removes all elements from the stack, resetting it to an empty state.\n")
            .append("   - Time Complexity: O(n), as it iterates over all elements.\n")
            .append("   - Space Complexity: O(1), as only references are removed, not the underlying array.\n\n");

        desc.append("7. search(Object element):\n")
            .append("   - Description: Searches for a specific element in the stack and returns its position.\n")
            .append("   - Time Complexity: O(n), since it may require scanning the entire stack.\n")
            .append("   - Space Complexity: O(1), as no additional space is allocated.\n\n");

        desc.append("8. contains(Object element):\n")
            .append("   - Description: Checks if a specific element exists in the stack.\n")
            .append("   - Time Complexity: O(n), as it may scan the entire stack to locate the element.\n")
            .append("   - Space Complexity: O(1), as it only checks without storing additional data.\n\n");

        desc.append("Overall Time and Space Complexity:\n")
            .append("   - Average Time Complexity for push: O(1); worst-case: O(n) (when resizing).\n")
            .append("   - Time Complexity for pop, peek, isEmpty, and size: O(1).\n")
            .append("   - Time Complexity for search and contains: O(n).\n")
            .append("   - Space Complexity: O(n) for the underlying array, which stores all elements.\n");

        System.out.println(desc.toString());
    }



    private void resizeArray() {
        T[] newArray = (T[]) new Object[arrayStack.length * 2];
        System.arraycopy(arrayStack, 0, newArray, 0, arrayStack.length);
        arrayStack = newArray;
    }
}
