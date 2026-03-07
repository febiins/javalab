package record;
import java.util.*;
import java.net.*;
import java.io.*;

public class P48 {
    public static void main(String[] args) {
       try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url:");
        String u=sc.nextLine();
        URL url =new URL(u);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        System.out.println("\n--- Webpage Content ---\n");
        while((line=in.readLine())!=null){
            System.out.println(line);
        }

        }catch(Exception e){
            System.out.println(e);
        } 
    }
    
}
