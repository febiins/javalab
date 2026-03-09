package exam;
//files in a folder is copied using multiple threads

import java.io.*;

class TrialTwo extends Thread{
    File source,destination;
    FileInputStream fin;
    FileOutputStream fout;
    public TrialTwo(File source,File destination){
        this.source=source;
        this.destination=destination;
    }
    public void run(){
        try {
                fin=new FileInputStream(source);
                fout=new FileOutputStream(destination+"\\"+source.getName());

                int ch;
                while((ch=fin.read())!=-1){
                    fout.write(ch);
                }
                System.out.println("Copied :"+source.getName());
                
            }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThFileCopy {
    public static void main(String[] args) {
        try {
            File source,destination;
            source=new File("D:\\java\\javalab\\exam");
            destination=new File("D:\\exam2");
            if(!destination.exists()){
                destination.mkdir();
            }
            File files[] = source.listFiles();
            
            for(int i=0;i<files.length;i++){
                if(files[i].isFile()){
                    TrialTwo obj = new TrialTwo(files[i], destination);
                    obj.start();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
