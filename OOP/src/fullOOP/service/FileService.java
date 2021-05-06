package fullOOP.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
    public static void createFolder(String path){
        File file=new File(path);
        file.mkdir();

    }
    public static void createFile(String path ,String name) throws IOException {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File file = new File(path + File.separator + name);
        file.createNewFile();

    }
    public static void write(String path,String text) throws IOException {
        Files.write(Paths.get(path),text.getBytes());
    }
    public static List<String> read(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }



}
