package ru.zak.currentthread;
/**
 * Класс, демострирующий использование методов
 * класса Thread
 * в главном потоке программы
 *
 */
public class CurrentThreadDemo {
 public static void main(String[]args){
     //переменная thread ссылается на главный поток программы
     Thread thread = Thread.currentThread();
     //ввод сведений о главном потоке
     System.out.println("Текущий поток: " + thread);
     System.out.println("Имя потока "+ thread.getName());
     System.out.println("Приоритет потока: "+ thread.getPriority());
     System.out.println("Группа потока: "+thread.getThreadGroup());
     System.out.println("Индификатор потока: " + thread.getId());
     System.out.println("Состояние потока:" + thread.getState());
     thread.setName("Главный поток");
     thread.setPriority(10);
     System.out.println("Теперь текущий поток: "+ thread);
     //ввод цифры с задержкой потока на 1 секунду
     for (int i = 5; i>0; i--){
         System.out.println(i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e){
             System.out.println("Поток завершен");
         }
     }
    }
}
