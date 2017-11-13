package ru.zak.catchup;

public class Catchup extends Thread {
    public static void main(String[] args) {

        Play playerOne = new Play("Mause",MIN_PRIORITY,MAX_PRIORITY);
        Play playerTwo = new Play("Cat",MAX_PRIORITY,MIN_PRIORITY);
        playerOne.start();
        playerTwo.start();
    }
}


