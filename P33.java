
class Account{
    int currentbalance=0,total=0;

    public void deposit(int amount){
        total+=amount;
        currentbalance=total;
        boolean credit = true;
        if(credit){
            System.out.println("The total savings in your account is: "+total);
        }
    }
    public void withdraw(int amount){
        if(amount>currentbalance){
            System.out.println("In sufficient balance your account have");
        }else{
            currentbalance-=amount;
            total=currentbalance;
            System.out.println("Your balance is: "+total);
        }
    }
}

class Deposit extends Thread{
    Account ac;
    int amount;
    public Deposit(Account ac,int a){
        this.ac = ac;
        amount =a;
    }
    public void run(){
        ac.deposit(amount);
    }
}

class Withdraw extends Thread{
    Account ac;
    int amount;
    public Withdraw(Account ac,int a){
        this.ac = ac;
        amount = a;
    }
    public void run(){
        ac.withdraw(amount);
    }
}

public class P33 {
    public static void main(String[] args) {
        Account ac = new Account();
        Deposit d = new Deposit(ac,500);
        Withdraw w = new Withdraw(ac,100);
        Deposit d2 = new Deposit(ac,1000);
        Withdraw w2 = new Withdraw(ac,500);
        d.start();
        w.start();
        d2.start();
        w2.start();

    }
}
