package ru.zak.interferensl;

public class InterferenceThread extends Thread {
private final InterferenceExample checker;
private static int i;
public InterferenceThread(String name, InterferenceExample checker){
    super(name);
    this.checker = checker;
}
public void run(){
    System.out.println(this.getName()+"Запущен");
    while (!checker.stop()){
        increment();
    }
    System.out.println(this.getName() + "Запущен");
}
public void increment(){++i;}
public int getI(){return i;}
}

