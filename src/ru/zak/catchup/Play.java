package ru.zak.catchup;

public class Play extends Thread{
    private String name;
    private int onePriority;
    private int twoPriority;



    public Play(String name, int onePriority, int twoPriority) {
        this.name = name;
        this.onePriority = onePriority;
        this.twoPriority = twoPriority;
    }

    public void run(){
        Thread thread = Thread.currentThread();
        thread.setPriority(onePriority);
        for (int i = 0; i < 10000; i++) {


            System.out.println(name+" "+ i);
            if (i==5000){
                thread.setPriority(twoPriority);

            }
        }


    }
}
