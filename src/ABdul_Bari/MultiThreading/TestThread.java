package ABdul_Bari.MultiThreading;

class MyThreads extends Thread {

    public MyThreads(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }

    public void run(){

        int count = 1;
        while(true)
        {
            System.out.println(count++);
            try {
                Thread.sleep(10000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            }
    }
}

public class TestThread {
    public static void main(String[] args) {

        MyThreads t = new MyThreads("My name is faysal");
//        System.out.println("ID : "+t.getId());
//        System.out.println("Name : "+t.getName());
//        System.out.println("Priority :"+t.getPriority());
//        t.start();
//
//        System.out.println("State "+t.getState());
//        System.out.println("Alive :"+t.isAlive());
        t.start();

    }
}
