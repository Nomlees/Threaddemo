package ru.zak.chicken;


public class Chicken extends Thread {
    public static void main(String[]args) {
        Chickens chickens = new Chickens();
        ChickenMather chickenMather = new ChickenMather();
        (new Thread(new Chickens())).start();
        (new Thread(new ChickenMather())).start();

       System.out.println(chickenMather);
       System.out.println(chickens);


    }
public static class Chickens extends Thread{
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


    public static class ChickenMather extends Thread{
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




   /** public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Курица");
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(" Не Курица");

        }
        (new Thread(new Chicken())).start();


    }

}*/
