package ru.zak.run;

/**
 * Класс реализует догонялки между потоками
 */
public class run extends Thread {
    /**
     * Первый поток с приорететом 1, который после 50 меняется на 10
     */
    public void run() {

        Thread thread = Thread.currentThread();
        thread.setPriority(1);
        for (int i = 0; i < 100; i++) {

            if(i == 50){
            thread.setPriority(10);
        }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
            System.out.println(i + " Киса");

        }
    }
    /**
     * Второй поток с приорететом 10, который после 50 меняется на 1
     */

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        thread.setPriority(10);
        (new run()).start();

        for (int i = 0; i < 100; i++) {
            if(i == 50){
                thread.setPriority(1);
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }

            System.out.println(i + " Мышь");
        }
    }

}

