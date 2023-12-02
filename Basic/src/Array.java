
public class Array {

	public static void main(String[] args) {

		

		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		Students students[] = new Students[3];

		s1.rollno = 11;
		s1.name = "junaid";
		s1.mark = 90;

		s2.rollno = 22;
		s2.name = "shibi";
		s2.mark = 99;

		s3.rollno = 23;
		s3.name = "sinan";
		s3.mark = 100;
	

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(Students stud: students)
		{
			System.out.println(stud.name+" : " +stud.mark);
		}
//
//		//System.out.println(s1.name + " " + s1.mark);
//
//		
//		  for(int i=0;i<students.length;i++) 
//		  { System.out.println(students[i].rollno+" "+students[i].name+" "+students[i].mark); }
//		 
//		int a[] = new int[5];
//		
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=55;
//		
//		for(int s:a)
//		{
//			System.out.println(s);
//		}
		

	}
}

class Students {
	int rollno;
	String name;
	int mark;

}