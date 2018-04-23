package logger;
import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Logger {
    private File file;
    private String prefix;
    LocalDate date;


    public Logger(File file, String prefix){
        this.file = file;
        this.prefix = prefix;
        Scanner scanner = new Scanner(System.in);
    }
    public Logger(File file){
        this(file,"Default");
        Scanner scanner = new Scanner(System.in);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String log(String text){
        date = LocalDate.now();
        return date + " " + prefix + "- "+text;
    }

}
