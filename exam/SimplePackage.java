package exam;
//create a folder factorial in the main folder that you create java programs.
//create a class Fact the code is given Fact.java
//import the folder user "*" for making easy
//create the object of the class Fact and call the method.
//eg: importing the util package and using scanner. it is an example of package
//compile the Fact.java then call it 
import factorial.*;

public class SimplePackage {
    public static void main(String args[]){
        int result;
        Fact f = new Fact();
        result=f.fact(5);
        System.out.println(result);
    }    
}
