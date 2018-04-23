package logger;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        File file = new File("C:\\Users\\Kamil\\IdeaProjects\\Files\\LoggerDirectory\\Plik tekstowy2.txt");
        createFile(file);

        Logger logger = new Logger(file, "prefix");
        System.out.println("Enter the message: ");
        String message = sc.nextLine();
        String saveMessage = logger.log(message);
        main.saveFile(file,saveMessage+"\r\n");


    }


    public void saveFile(File file, String message){
        try {
            Files.write(file.toPath(), message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(File file){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
