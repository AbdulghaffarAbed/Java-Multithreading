package org.example;

public class DemoThread extends Thread{
    private Thread thread;
    private String threadName;

    public DemoThread(String threadName){
        this.threadName=threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread name "+threadName);

        for(int i =0;i<100;i++){
            System.out.println(threadName+" "+i);
        }
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (thread == null) {
            thread = new Thread (this, threadName);
            thread.start ();
        }
    }

}
