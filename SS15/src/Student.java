
public class Student {

	String name;
	int rollno;
	int marks;
	
	
	Student(String name, int rollno, int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	void show() {
		System.out.println("name= "+name+" rollno = "+rollno+" mark="+marks);
	}
	public static void main(String[] args) {
		
		Student obj=new Student("junaid", 7, 70);
		obj.show();
	}
}
