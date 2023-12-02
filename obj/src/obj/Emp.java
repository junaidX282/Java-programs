package obj;

public class Emp {

	int id;
	String name;
	Address address;
	
	Emp(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display() {
		System.out.println(id+" : "+name);
		System.out.println(address.city+" "+address.state+" "+address.contry);
	}
	
	public static void main(String[] args) {
		Address addres1=new Address("tirur","kerala","india");
		Address address2=new Address("madina", "saudi","saudi arabia");
		
		Emp e=new Emp(777,"junaid",addres1);
		Emp e2=new Emp(888,"abu", address2);
		
		e.display();
		e2.display();
	}
}
