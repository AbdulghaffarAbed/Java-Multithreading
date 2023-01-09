package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Integer y = 5+10;
        Double z = 6.3+32.5-4.9;
        String st = "hello world";

        printMsg(y);
        printMsg(z);
        printMsg(st);
        Integer arr []={1,3,7};
        System.out.println("*********************"+ Arrays.stream(arr).count());
        mathOp(arr);

        DemoThread thread = new DemoThread("thread1");

        thread.start();

        DemoThread thread2 = new DemoThread("thread2");
        thread2.sleep(10000);
        thread2.start();


    }
    public static <T> void printMsg(T x){
        System.out.println(x);
    }

    public static <T> long mathOp(T x[]){
        return Arrays.stream(x).count();
    }
}