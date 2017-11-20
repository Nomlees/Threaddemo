package ru.zak.filethread;
import java.io.*;
/**
 * Программа, позволяющая двум потокам параллельно читать данные из двух разных текстовых файлов,
 * затем записывать считанные данные в результирующий файл по принципу:
 * строка из первого файла, строка из второго файла
 */
public class FileThread extends Thread {
    private String adress;
    private static volatile BufferedWriter bufferedWriter;
    //Конструктор

    public FileThread(String adress) {
        this.adress = adress;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        FileThread oneThread = new FileThread("C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\filethread\\1.txt");
        FileThread twoThread = new FileThread("C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\filethread\\2.txt");
        bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\Threaddemo\\src\\ru\\zak\\filethread\\output.txt"));
        oneThread.start();
        twoThread.start();

        if(oneThread.isAlive()){
            oneThread.join();
        }
        if (twoThread.isAlive()){
            twoThread.join();
        }
        bufferedWriter.close();


    }

    /**
     * Метод считывает строку и сохраняет в переменную a
     * до тех пор, пока файл не станет пустым
     */
    public void run(){
        String a;
        try(BufferedReader one = new BufferedReader(new FileReader(adress)))
        {
            while ((a = one.readLine())!=null){
               write(a+"\n");
            }

        } catch (IOException e){
        }

   }

    /**
     * Метод записи строк в файл
     * @param  a - строка
     */
   public static synchronized void write(String a) throws IOException{
       bufferedWriter.write(a);
   }
}
