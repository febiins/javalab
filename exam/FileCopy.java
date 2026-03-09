package exam;
//files in a folder is copied without thread. This is the base concept for copying files using thread
//understand the logic and concept. After clearing this only move to the next program with thread
//Th containing files repersents it is done with thread 
import java.io.*;

class TrialOne{

    FileInputStream fin;
    FileOutputStream fout;

    public void copy(){
        try {
            File sourceFolder = new File("D:\\java\\javalab\\exam");
            File destFolder = new File("D:\\exam2");
            if(!destFolder.exists()){
                destFolder.mkdir();
            }
            File files[]=sourceFolder.listFiles();
            for(int i=0;i<files.length;i++){
                File f = files[i];
                if(f.isFile()){
                    fin = new FileInputStream(f);
                    fout = new FileOutputStream(destFolder + "\\" + f.getName());
                     int ch;
                    while((ch=fin.read())!=-1){
                        fout.write(ch);
                        
                    }
                    System.out.println("copied :"+f.getName());
                    fin.close();
                    fout.close();
                }
            }
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class FileCopy{
    public static void main(String args[]){
        TrialOne obj = new TrialOne();
        obj.copy();
    }

}