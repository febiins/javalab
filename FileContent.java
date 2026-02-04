import java.io.*;

public class FileContent {
    public static void print(File file){
        File [] f = file.listFiles();
        for(int i=0;i<f.length;i++){
            File fi = f[i];
            if(fi.isDirectory()){
                System.out.println(fi.getName());
            }
            else{
                System.out.println(fi.getName());
            
            }
        }
    }
    public static void main(String[] args) {
        File f = new File("D:\\testfolder");
        print(f);
    }
}
