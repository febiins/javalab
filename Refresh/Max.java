class Demo{

	void logic1(int a,int b,int c){
		int max;
		if(a>b && a>c){
			max=a;		
		}else if(b>a && b>c){
			max=b;
		}else{
			max=c;
		}
		System.out.println("Max value is "+max);
	}
	void logic2(int a,int b,int c){
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Max value is "+max);
		
	}
	void logic3(int a,int b,int c){
		int arr[]={a,b,c};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){

			if(arr[i]>max){
			    max=arr[i];		
			}
		}
		System.out.println("Max value is "+max);
		
	}



}



public class Max{

	public static void main(String args[]){
		Demo obj = new Demo();
		obj.logic1(10,20,6);
		obj.logic2(10,0,6);
		obj.logic3(1,0,6);

	}

}