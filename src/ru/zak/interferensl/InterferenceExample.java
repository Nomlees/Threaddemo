package ru.zak.interferensl;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Пример для равнения результатов
 */
public class InterferenceExample {
    private static final int HUNDRRD_MILLION = 100_000_000;
    private AtomicInteger counter = new AtomicInteger();
    public boolean stop(){
        return counter.incrementAndGet()>HUNDRRD_MILLION;
    }
    public void example() throws InterruptedException{
        InterferenceThread thread1 = new InterferenceThread("Поток 1", this);
        InterferenceThread thread2 = new InterferenceThread("Поток 2", this);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Ожидаем"+HUNDRRD_MILLION);
        System.out.println("Получили"+thread1.getI());
    }
}
