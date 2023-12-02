package polymorphism;

public class India {

	public void speak() {
		System.out.println("i can speak indian language");
		
	}

}
class Delhi extends India{
	
	public void speak() {
		System.out.println("i can speak Hindi");
		
	}
}
class kearala extends India{
	
	public void speak() {
		System.out.println("i can speak malayalam");
		
	}
}