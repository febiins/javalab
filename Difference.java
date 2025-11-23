

public class Difference{

	void diff(int a, int b){
		int difference=a;

		while(b>0){

			difference--;
			b--;		
		}
		System.out.println("Difference is "+difference);
	}

	public static void main(String args[]){
		new Difference().diff(10,4);
	}

}