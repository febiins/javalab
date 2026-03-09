package exam;
import java.io.*;

class TrialThree{
    
    FileInputStream fin;
    FileOutputStream fout;
    public void rCopy(File source, File destination){
        try {
            if(source.isDirectory()){
                if(!destination.exists()){
                    destination.mkdir();
                }
                String files[]=source.list();
                for(int i=0;i<files.length;i++){
                    File s = new File(source,files[i]);
                    File d = new File(destination,files[i]);
                    rCopy(s, d);
                }
            }else{
                fin = new FileInputStream(source);
                fout=new FileOutputStream(destination);
                int ch;
                while((ch=fin.read())!=-1){
                    fout.write(ch);
                }
                fin.close();
                fout.close();

                System.out.println("Copied: " + source.getName());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        



    }
}
public class RecursiveFileCopy {
    public static void main(String[] args) {

        File source = new File("D:\\java\\javalab\\exam");
        File destination = new File("D:\\exam2");
        TrialThree obj = new TrialThree();

        obj.rCopy(source, destination);
    }
}
