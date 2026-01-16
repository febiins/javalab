import java.io.*;

class FileCopy extends Thread{
    File source;
    File destination;
    FileInputStream fin;
    FileOutputStream fout;

    public FileCopy(File s,File d){
        source = s;
        destination=d;

    }
    int ch;
    public void run(){
        try{
            fin = new FileInputStream(source);
            fout = new FileOutputStream(destination);
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            fin.close();
            fout.close();
        } catch (Exception e) {}
            
    } 
    
}
public class CopyThread{
    public static void main(String[] args) {
        File source = new File("D:\\testfolder");
        File destination = new File("D:\\testfolder2");

        String a[];
        try {
        a=source.list();
        for(int i=0;i<a.length;i++){

            File src = new File(source,a[i]);
            File dest = new File(destination,a[i]);

            FileCopy obj = new FileCopy(src, dest);
            obj.start();
        }

    }catch(Exception e){}
    
}
}
