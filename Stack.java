package newpackage3;
public class Stack{

    private int counter;
    private int[] storage;
    
    public Stack(final int number) {
        storage = new int[number];
        counter = 0;
    }
    
    public synchronized void push(final int msg) {
        if(counter == storage.length) {
            System.out.println("Counter full");
        } 
        else{
            storage[counter++] = msg;
        }
    }
    
    public synchronized int pop() {
        if(isEmpty()) {
            System.out.println("There is nothing to pop");
            return 0;
        } else {
            int lastElement = storage[--counter];
            storage[counter] = 0;
            return lastElement;
        }
    }
    
    public boolean isEmpty() 
    {
        return counter==0?true:false;
    }
    
    public synchronized void printElements() 
    {
        for(int i=0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
        System.out.println("Number of elements "+counter);
    }
}
