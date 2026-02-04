import java.io.*;


public class WCcommand {
    public static void main(String[] args) {
        File f1 = new File(args[0]);
         

         int line=0,character=0,word=0;
         String lines;
         try{
            BufferedReader br = new BufferedReader(new FileReader(f1));
            while((lines=br.readLine())!=null){
                line++;
                character+=lines.length();

                String [] wordArray = lines.trim().split("\\s+");
                if(!lines.trim().isEmpty()){
                    word+=wordArray.length;
                }
            }
            br.close();
            System.out.println("Lines      : " + line);
            System.out.println("Words      : " + word);
            System.out.println("Characters : " + character);
         }
         catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
