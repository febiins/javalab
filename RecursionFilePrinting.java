import java.io.*;


public class RecursionFilePrinting {
    public static void printFile(File dir){
        File [] file = dir.listFiles();

        for(int i=0;i<file.length;i++){
            File f = file[i];
            if(f.isDirectory()){
                System.out.println("Directory: " + f.getName());
                printFile(f);
            }else{
                System.out.println("File: " + f.getName());
            }
        }
    }
    public static void main(String[] args) {
        File directory = new File("D:\\testfolder");
        printFile(directory);
    }
}
