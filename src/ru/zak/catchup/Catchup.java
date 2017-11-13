package ru.zak.catchup;

public class Catchup extends Thread {
    public static void main(String[] args) {

        Play playerOne = new Play("Mause",MAX_PRIORITY,MIN_PRIORITY);
        Play playerTwo = new Play("Cat",MIN_PRIORITY,MAX_PRIORITY);
        playerOne.start();
        playerTwo.start();
    }
}


