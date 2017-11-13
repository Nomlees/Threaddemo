package ru.zak.chicken;


public class Chicken extends Thread {
    public static void main(String[]args) {
        Egg egg = new Egg();
        Chickens chickens = new Chickens();
        (new Thread(new Chickens())).start();
        (new Thread(new Chickens())).start();

       System.out.println(chickens);
       System.out.println(egg);


    }
public static class Egg extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Яйцо");

            }
            System.out.println("Яйцо");
        }
    }
    }


    public static class Chickens extends Thread{
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Курица");
                }
                System.out.println("Курица");

            }
        }
    }

}
