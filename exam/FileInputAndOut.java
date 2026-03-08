package exam;
//give the path of the .txt file according to your system
import java.io.*;

public class FileInputAndOut {
    public static void main(String args[]){
        try {
            FileInputStream fin = new FileInputStream("D:\\java\\javalab\\exam\\simple.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");

            int i;
            while((i=fin.read())!=-1){
                fout.write(i);
            }
            fin.close();
            fout.close();
            System.out.println("File is copied");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
