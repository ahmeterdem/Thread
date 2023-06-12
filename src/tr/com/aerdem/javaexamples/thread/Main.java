package tr.com.aerdem.javaexamples.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyThreadEx threadEx=new MyThreadEx();
        Thread thread=new Thread(threadEx);
        thread.start();
        for (int i=1;i<100;i++){
            System.out.println("Main Thread :" +i);
        }
        
    }
}

class MyThreadEx implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<100;i++){
            System.out.println("Child Thread :" +i);
        }
    }
}