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
public class Counter implements Runnable {

    Thread t;
    int cnt = 0;
    volatile boolean flag;
    
    public Counter (int p){
        t = new Thread(this);
        t.setPriority(p);
    }
    
    public void begin(){
        flag = true;
        t.start();
    }

    @Override
    public void run() {
        while(flag){
            cnt++;
        }
    }
    
    public void end(){
        flag = false;
    }

}
