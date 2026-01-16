
class Bank{
    int total=0,currentbalance=0;
    synchronized public void deposite(int amount,String user){
        total+=amount;
        currentbalance=total;
        boolean credit = true;
        if(credit){
            System.out.println(user + " is deposited: " + amount);
        }
    }
    synchronized public void withdraw(int amount, String user){
        if(amount>currentbalance){
            System.out.println("Insufficent balance");
        }else{
            currentbalance-=amount;
            total=currentbalance;
            System.out.println(user + " completed withdrawal. Balance: " + currentbalance);

        }
       
    }
}

class ATM extends Thread{
    Bank b;
    String user;
    int deposite;
    int withdraw;
    public ATM(Bank b,String user,int deposite,int withdraw){
        this.b=b;
        this.user=user;
        this.deposite=deposite;
        this.withdraw=withdraw;
    }
    public void run(){
        b.deposite(deposite, user);
        b.withdraw(withdraw, user);
    }
}


public class P35 {
    public static void main(String[] args) {
        Bank b =new Bank();
        ATM u1 = new ATM(b, "user1", 1000,100);
        ATM u2 = new ATM(b, "user2", 2000,500);
        u1.start();
        u2.start();
    }
}
