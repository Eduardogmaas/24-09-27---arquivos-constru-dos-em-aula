package atividade;

import modelo.HelloFromThreads;

public class HelloMaster {

    private int num_threads;
    private Thread[] v_threads;
    
public HelloMaster(int n){
    this.num_threads = n;
    this.v_threads = new Thread[num_threads];
}
    
    public void letsGetSomeHellos(){

        for (int t = 0; t < num_threads; t++){
            v_threads[t] = new Thread(new HelloFromThreads(t));
            v_threads[t].start();
            // Thread t0 = new Thread(new HelloFromThreads(t));
            // t0.start();
        }

        // Thread t0 = new Thread(new HelloFromThreads(0));
        // Thread t1 = new Thread(new HelloFromThreads(1));
        // Thread t2 = new Thread(new HelloFromThreads(2));
        // Thread t3 = new Thread(new HelloFromThreads(3));

        // t0.start();
        // t1.start();
        // t2.start();
        // t3.start();
    }
}
