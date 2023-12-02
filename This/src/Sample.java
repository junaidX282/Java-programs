
public class Sample {
	
	int a=200,b=300;
	Sample(int a,int b){
		
		this.a=a;
		b=this.b;
		int c=a+b;
		System.out.println(this.a+" "+b);
	}
	

	void display(int a,int b) {
		a=this.a;
		System.out.println(a);
	}
}
