import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FileIOLecture {
        public static void main(String [] args)  {
        }


    interface Marker {
        public void write();
    }


}
//    public static void main(String [] args) throws IOException {
////        newFile();
////        writeFile();
////        readFile();
//        readWriteFile();
//    }
//    static void newFile(){
//        String directory = "data";
//        String filename = "info.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        System.out.println(dataDirectory.toAbsolutePath());
//        Path dataFile = Paths.get(directory, filename);
//
//        try {
//            if (Files.notExists(dataDirectory)) {
//                Files.createDirectories(dataDirectory);
//                System.out.println("created directory");
//            }
//
//            if (!Files.exists(dataFile)) {
//                Files.createFile(dataFile);
//                System.out.println("created file");
//            }
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//    }
//    static void writeFile(){
//        List<String> fruit = new ArrayList<>();
//        fruit.add("banana"); fruit.add("orange");
//
//        for(String fr : fruit) {
//            System.out.println(fr);
//        }
//        try {
//            Path filepath = Paths.get("data", "groceries.txt");
//            Files.write(filepath, fruit);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//    }
//
////    static void readFile() throws IOException {
////
////        Path groceriesPath = Paths.get("data", "groceries.txt");
////        List<String> groceryList = Files.readAllLines(groceriesPath);
////
////        for (int i = 0; i < groceryList.size(); i += 1) {
////            System.out.println((i + 1) + ": " + groceryList.get(i));
////        }
////
//        static void readWriteFile(){
//            List<String> fruit = null;
//            try {
//                Path groceries = Paths.get("data", "groceries.txt");
//                fruit = Files.readAllLines(groceries);
//             for (String line : fruit);
//                System.out.println(line);
//            }
//            catch (IOException ioe) {
//                ioe.printStackTrace();
//            }
//            fruit.add("Kiwi"); fruit.add("starfruit");
//            try {
//                Path groceries = Paths.get("data", "groceries.txt");
//                Files.write(groceries, fruit);
//            } catch (IOException ioe){
//                ioe.printStackTrace();
//        }
//
//
//    }


