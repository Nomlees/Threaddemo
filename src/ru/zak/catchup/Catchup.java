package ru.zak.catchup;

/**
 *пааааааааааамааааааааашшшшшшшшииииииииитттттттттееееееееее
 */
public class Catchup extends Thread {
    private Catchup() {
        super("Мышь");
        setPriority(1);
        setName("Мышь");
    }

    public static void main(String[] args) {
        Catchup catchup = new Catchup();
        Thread thread = Thread.currentThread();
        thread.setName("КОШКА!!!!!");
        thread.setPriority(10);
        for (int i = 0; i < 100; i++) {
            (new Thread(new Catchup())).start();
            (new Thread()).start();

            if (i == 50) {
                thread.setPriority(1);
                catchup.setPriority(10);
            }
            if (thread.getPriority() == 1){
                System.out.println(i+" "+thread.getName());
                System.out.println(i+" "+ catchup.getName());
            } else {
                System.out.println(i+" "+ catchup.getName());
                System.out.println(i+" "+thread.getName());
            }

        }

    }
}


      /**  public void run() {
            Thread thread = Thread.currentThread();

            thread.setPriority(10);
        for (int i = 0; i < 100; i++) {
                if (i == 50) {
                thread.setPriority(1);
            }
                System.out.println(i + "Кошка");
            }

        }
    public static void main(String[] args) {
        (new Thread(new Catchup())).start();
        Thread thread = Thread.currentThread();
        Catchup catchup = new Catchup();
        catchup.start();
        thread.setPriority(1);
        for (int i = 0; i < 100; i++) {
            if (i==50){
                thread.setPriority(10);
            }
            System.out.println(i+"This is мышь" );
        }
    }
}
       **/



