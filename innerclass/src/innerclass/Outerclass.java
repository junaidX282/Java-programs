package innerclass;

public class Outerclass  {

	int f=10;
	
  class Innerclass{
		  int a=44;
	 void display() {
		System.out.println("innerclass");
		
	}
  }
}
class Main{
	public static void main(String[] args) {
		Outerclass out=new Outerclass();
		Outerclass.Innerclass inn=out.new Innerclass();
		System.out.println(inn.a);
	}
}