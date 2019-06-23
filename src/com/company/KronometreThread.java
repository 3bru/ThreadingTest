package com.company;

public class KronometreThread implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */

    private Thread t;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("thread olusturuluyor : " + threadName);
    }

//Burada istediğimiz classı çağırıp koşabiliriz
    @Override
    public void run() {
    System.out.println("thread calıstırılıyor : " + threadName);


    try {
        for (int i = 0; i<10; i++){
            System.out.println(threadName + "i");
            Thread.sleep(100);
    }
    }
    catch (InterruptedException exeption){
        System.out.println("Interrupt geldi" + threadName);
    }

    System.out.println("Thread sonlandı : " + threadName);
    t.run();//run ile thraed baslatılıyor
}
 //Thread'i başlatmak icin bu yapıyı genel olarak her yerde kullanıyoruz
    public void start(){
        System.out.println("thread nesnesi oluşturuyor");

        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }

    }

}
