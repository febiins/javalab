package exam;
//constructor invokation using super method
//note that the java version 25 and above can call multiple super method to invoke parent class constructors
//currently only do this method for lab exam

class Department{
    String dname;
    public Department(String dname){
        this.dname=dname;
    } 

    public void dShow(){
        System.out.println("Department name is:"+dname);
    }
}

class Manager extends Department{
    String mname;
    public Manager(String mname,String dname){
        super(dname);
        this.mname=mname;
    } 

    public void mShow(){
        System.out.println("Manager name is:"+mname);
    }
}

class Emp extends Manager{
    String ename;
    public Emp(String ename,String dname,String mname){
        super(mname,dname);
        this.ename=ename;
    } 

    public void eShow(){
        System.out.println("Employee name is:"+ename);
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        Emp obj= new Emp("sebin", "development", "febin");
        obj.dShow();
        obj.mShow();
        obj.eShow();
    }
}
