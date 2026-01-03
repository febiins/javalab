/*
Implement Printer Queue Simulation without synchronization but using multiple
threads.
@Febin Sunny
 Roll No: 27
 17-11-2025
*/

class Printer{
    public void printFile(String user, String filename){
        System.out.println(user + " started printing " +filename);
        for(int i=1;i<=5;i++){
            System.out.println(user + " printing "  + filename + " pageno " +i);
                    
        }

        System.out.println(user + " finished printing: " + filename);
        System.out.println();
    }

}

class User extends Thread{
    Printer p;
    String user,filename;
    public User(Printer p, String user, String filename){
        this.p = p;
        this.user = user;
        this.filename =filename;
    }
    public void run(){
        p.printFile(user, filename);
    }
}



public class P30 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        User u1 = new User(obj, "user1", "file1");
        User u2 = new User(obj, "user2", "file2");
        User u3 = new User(obj, "user3", "file3");

        u1.start();
        u2.start();
        u3.start();
    }    
}
