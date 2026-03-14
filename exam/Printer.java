package exam;


class Printers{
    synchronized public void print(String user,String file){
        System.out.println(user+"has started printing"+file);
        for(int i=1;i<5;i++){
            System.out.println("printing"+file+"page"+i);
        }
    }
 }

 class User extends Thread{
    Printers p;
    String user,file;
    public User(Printers p,String user,String file){
        this.p=p;
        this.user=user;
        this.file=file;
    }
    public void run(){
        p.print(user,file);
    }
    
 }
public class Printer {
    public static void main(String[] args) {
        Printers p = new Printers();
        User obj1=new User(p,"user1","file1");
        User obj2=new User(p,"user2","file2");
        User obj3=new User(p,"user3","file3");
        obj1.start();
        obj2.start();
        obj3.start();
    }
    
}
