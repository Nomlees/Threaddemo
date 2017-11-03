package ru.zak.hellothread;

/**
 * Создание подкласса Thread
 *
 * Класс Thread сам реализует интерфейс Runnable,
 * хотя его метод run() ничего не делает.
 * Подкласс класса Thread может
 * обеспечить собственную реализацию метода run()
 */

public class HelloThread extends Thread{
    public void run(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Поток завершен");
        }
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]){
        (new HelloThread()).start();
        System.out.println("Hello from main thread!");
    }
}
