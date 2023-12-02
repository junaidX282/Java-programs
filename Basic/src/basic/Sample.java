package basic;

import java.util.Scanner;

//public class Sample {
//
//	
//	Sample(){
////		this(6);
//		final int a;
//		
//	}
//	Sample(int a){
//		//Sample obj = new Sample();
//		final int b;
//		
//		
//	} 
//	void demo() {
////		final int b;
////		b=90;
////		
//	}
//	//final char c;
//	
//	public static void main(String[] args) {
//		final int j;
//	}
//}
class Bike{  
	 int speedlimit=90;  
	}  

	class Honda3 extends Bike{  
		Scanner sc = new Scanner(System.in);

	 int speedlimit=150;  
	 public static void main(String args[]){  
	 // Bike obj=new Bike();  
		 Bike obj = new Honda3();
	  System.out.println(obj.speedlimit);//90  
	  
	  
	   }
	 
	
	}