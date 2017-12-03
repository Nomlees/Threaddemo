package ru.zak.copyfiles;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        Copy one = new Copy("C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\copyfiles\\main.txt",
                "C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\copyfiles\\outputOne.txt");
        one.start();

        if(one.isAlive()){
            one.join();
        }
        System.out.println("Выполнение первого: "+(System.currentTimeMillis() - before) + " милисекунд(ы)");

        long beforeOne = System.currentTimeMillis();
        Copy two = new Copy("C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\copyfiles\\main.txt",
                "C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\copyfiles\\outputTwo.txt");
        two.start();
        if(two.isAlive()){
            two.join();
        }
        System.out.println("Выполнение второго: "+(System.currentTimeMillis() - beforeOne) + " милисекунд(ы)");


    }
}