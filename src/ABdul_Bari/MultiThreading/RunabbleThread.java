package ABdul_Bari.MultiThreading;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("Hello");
            i++;
        }
    }
}

public class RunabbleThread implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("Hello");
            i++;
        }
    }
}

class Multi {
    public static void main(String args[]) {
//        MyThread t1=new MyThread();
//        t1.start();

        RunabbleThread rt = new RunabbleThread();
        Thread t2 = new Thread(rt);

        t2.start();
        int i = 1;
        while (true) {
            System.out.println("World");
        }
    }
}