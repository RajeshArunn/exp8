package newpackage3;
public class NewMain6{
public static void main(String[] args) {
        Stack s = new Stack(10);        
        final Thread t1 =  new Thread(() -> {
            for(int i=0; i < 4; i++) {
                s.push(100);
            }
            for(int i=0; i < 2; i++) {
                s.push(200);
            }
            for(int i=0; i < 4; i++) {
                s.push(300);
            }            
        });        
        final Thread t2 = new Thread(() -> {
                        s.pop();            
        });        
        t1.start();
        t2.start();
        try {
            t2.join();
            t1.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }        
        s.printElements();
    }
}