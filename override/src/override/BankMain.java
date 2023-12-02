package override;

public class BankMain {

	int interest() {
		return 0;
	}
}

class Uco extends BankMain{
	int interest() {
		return 4;
	}
}

class Federal extends BankMain{
	
	int interest() {
		return 8;
	}
}

class Icici extends BankMain{
	int interest() {
		return 9;
	}
	
	public static void main(String[] args) {
		
		Uco u=new Uco();
		System.out.println("interst of "+u.interest());
		
		Icici i=new Icici();
		System.out.println("interst of "+i.interest());
	}
	
	
	
	
}