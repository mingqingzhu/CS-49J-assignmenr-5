import java.util.ArrayList;

/**
 * Simulate Stack data structure
 */
public class MyStack {
    private ArrayList<Integer> list;

    /**
     * Initialize empty Stack data structure
     */
    public MyStack() {
        //TODO: implement this constructor (just initialize list)
        this.list = new ArrayList<Integer>();
    }

    /**
     * Check if the stack is empty
     *
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        //TODO: implement this method
        if(list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Number of elements in the stack
     *
     * @return the size of the stack
     */
    public int getSize() {
        //TODO: implement this method
        int size = list.size();
        return size;
    }

    /**
     * Returns the top (last added) element in the stack without removing it
     *
     * @return the top of the stack
     */
    public int peek() {
        //TODO: implement this method
        int value = list.get(list.size() - 1);
        return value;
    }

    /**
     * Returns and removes the top (last added) element from the stack
     *
     * @return the top of the stack
     */
    public int pop() {
        //TODO: implement this method
        int value = peek();
        list.remove(list.size() - 1);
        return value;
    }

    /**
     * Add a new element to the top (the end of the list) of the stack
     *
     * @param value element to be added
     */
    public void push(int value) {
        //TODO: implement this method
        list.add(value);
    }

    @Override
    public String toString() {
        return "stack: " + this.list.toString();
    }
}
