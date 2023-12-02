class Sample{
	
	int num;
	String name;
	
	Sample(int num,String name){
		this.name=name;
		this.num=num;
	}
//	Sample(Sample s){
//		num=s.num;
//		name=s.name;
//	}
	public void display() {
		System.out.println("name ="+name+" num = "+num);
	}
}



class Main{
	
	public static void main(String[] args) {
		Sample s= new Sample(98952041,"junu");
		Sample s2=new Sample(98,"ki");
		s2.display();
		
		s.display();
		
	}
}