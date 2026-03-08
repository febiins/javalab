package exam;
//CAE1 question. Application question. Demonstrating runtime and array of objects.

import java.util.*;
interface Details{
    public void read();
    public void disp();
}

class Employees implements Details{
    int id,salary;
    String name;
    Scanner sc = new Scanner(System.in);
    public void read(){
        System.out.println("Enter the id of the employee");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee");
        name=sc.nextLine();
        
        System.out.println("Enter the salary of the employee");
        salary=sc.nextInt();
    }
    public void disp(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    public boolean search(int id){
        return this.id==id;
    }

}
public class ArrayOfObjects {
    public static void main(String args[]){
        int num;
        System.out.println("Enter the number of employees");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        Employees [] obj=new Employees[num];  

        for(int i=0;i<num;i++){
            obj[i]=new Employees();
            obj[i].read();
        }
        System.out.println("Enter the id to serach");
        int n =sc.nextInt();
        boolean flag=false;

        for(int i=0;i<num;i++){
            if(obj[i].search(n)){
                flag=true;
                obj[i].disp();
                break;
            }
        }
        
        if(!flag){
            System.out.println("invalid entry");
        }
    }
    
}
