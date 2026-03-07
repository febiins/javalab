package exam;

//IS-A
//calling constructors using super keyword
//prevention of method overriding using super keyword

class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
    public void dispName(){
        System.out.println("Student name is"+name);
    }
    public void show(){
        System.out.println("hi in student");
    }
}

class Faculty extends Student{
    String name;
    public Faculty(String s1,String s2){
        super(s1);
        name=s2;
    }
    public void search(){
        System.out.println("Facutly is searching for student" + name);
        dispName();
    }
    public void show(){
        System.out.println("hi in Faculty");
    }
    public void call(){
        super.show();
        show();
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Faculty obj = new Faculty("febin","febin");

        obj.search();
        obj.call();
        //obj.name();
    }
}
