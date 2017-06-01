/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsetprioritymethod2;

/**
 *
 * @author tiago.lucas
 */
public class ThreadSetPriorityMethod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter c1 = new Counter(Thread.NORM_PRIORITY);
        Counter c2 = new Counter(Thread.MAX_PRIORITY-2);
        Counter c3 = new Counter(Thread.MIN_PRIORITY+2);
        
        c1.begin();
        c2.begin();
        c3.begin();
        
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            
        }
        c1.end();
        c2.end();
        c3.end();
        
        System.out.println("Thread-1 Counter ::: "+c1.cnt);
        System.out.println("Thread-2 Counter ::: "+c2.cnt);
        System.out.println("Thread-3 Counter ::: "+c3.cnt);
    }
    
}
