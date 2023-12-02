
public class Student {

	int id;
	String name,collage;
	float fee;
	
	public Student(int id,String name,String collage) {
		
		this.id=id;
		this.name=name;
		this.collage=collage;
		
	}
	
	public Student(int id,String name,String collage,float fee) {
		this(id,name,collage);
		this.fee=fee;
		
	}
	
	void display() {
		System.out.println(id+" "+name+" "+collage+" "+fee);
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student(111,"junaid","b.y.k");
		Student s2=new Student(222, "shibi", "a.m.l",3432);
		s1.display();
		s2.display();
	}
}
