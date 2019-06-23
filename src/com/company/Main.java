package com.company;

public class Main {

    public static void main(String[] args) {
	    KronometreThread t1 = new KronometreThread("thread1");
	    KronometreThread t2 = new KronometreThread("thread2");
	    KronometreThread t3 = new KronometreThread("thread3");

	    t1.start();
	    t2.start();
	    t3.start();



    }
}
