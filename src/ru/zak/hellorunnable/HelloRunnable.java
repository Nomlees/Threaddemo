package ru.zak.hellorunnable;

/**
 * Реализация интерфейса Runnable
 *
 * Интерфейс Runnable определяет один метож run,
 * предназначеный для размещения кода, исполняемого в потоке.
 * Runnable-объект пересылается в конструктор Thread
 * и с помощью метода start() поток запускается
 */

public class HelloRunnable implements Runnable{

    public void run() {

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Поток завершен");
        }
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]){
        (new Thread(new HelloRunnable())).start();
        System.out.println("Hello from main thread!");
    }
}
