package ru.zak.filethread;

import java.io.*;

public class FileThread extends Thread {
    private String adress;
    private static volatile BufferedWriter bufferedWriter;

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
   public static synchronized void write(String a) throws IOException{
       bufferedWriter.write(a);
   }
}
