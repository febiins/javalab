class C1 extends Thread{
	int n;
	public C1(int n){
		this.n=n;
	}
	public void run(){
		for(int i=1;i<=n;i++){
			System.out.print(i);
		}
	}

}

class C2 extends Thread{
	int n;
	public C2(int n){
		
		this.n=n;
	}
	public void run(){
		for(int i=n;i>=1;i--){
			System.out.print(i);
		}
	}

	
}

public class MThread{
	public static void main(String args[]){

		C1 obj1;
		C2 obj2;
		obj1=new C1(10);
		obj2=new C2(10);
		obj1.start();
		obj2.start();
	}
}